(function () {
  // 瀹氫箟ajax get鏂规硶
  var Ajax = {
    get: function (url, fn) {
      // XMLHttpRequest瀵硅薄鐢ㄤ簬鍦ㄥ悗鍙颁笌鏈嶅姟鍣ㄤ氦鎹㈡暟鎹�   
      var xhr = new XMLHttpRequest();
      xhr.open('GET', url, true);
      xhr.onreadystatechange = function () {
        // readyState == 4璇存槑璇锋眰宸插畬鎴�
        if (xhr.readyState == 4 && xhr.status == 200 || xhr.status == 304) {
          // 浠庢湇鍔″櫒鑾峰緱鏁版嵁 
          fn.call(this, xhr.responseText);
        }
      };
      xhr.send();
    }
  }
  // 鑾峰彇url鍙傛暟
  function getUParmes(name) {
    return decodeURIComponent((new RegExp('[?|&]' + name + '=' + '([^&;]+?)(&|#|;|$)').exec(location.search) || [null, ''])[1].replace(/\+/g, '%20')) || null;
  }
  var channel = {
    t: !getUParmes('t') ? 'wg_1' : getUParmes('t'),
    c: !getUParmes('c') ? 2 : getUParmes('c')
  }
  var isWeixin = /MicroMessenger/i.test(navigator.userAgent);
  var isQQ = /QQ/i.test(navigator.userAgent);
  var isDouyin = /ByteLocale/i.test(navigator.userAgent)
  if (isWeixin) {
    channel.pr = 1
  } else if (isQQ) {
    channel.pr = 2
  } else if (isDouyin) {
    channel.pr = 4
  } else {
    channel.pr = 3
  }
  // 璁块棶椤甸潰缁熻鎺ュ彛
  var url = '//install.yzapi.top/api/analysis?'
  // 椤甸潰涓嬭浇鎸夐挳缁熻
  var downUrl = '//install.yzapi.top/api/click?'
  // t: 娓犻亾鍙�
  if (_my_5cu.t && _my_5cu !== '') {
    url = url + 't=' + _my_5cu.t
    downUrl = downUrl + 't=' + _my_5cu.t
  } else {
    url = url + 't=' + channel.t
    downUrl = downUrl + 't=' + channel.t
  }
  // c: 1.gd 2.hn 3.ys 4. qh
  if (_my_5cu.c && _my_5cu.c !== '') {
    url = url + '&c=' + _my_5cu.c
    downUrl = downUrl + '&c=' + _my_5cu.c
  } else {
    url = url + '&c=' + channel.c
    downUrl = downUrl + '&c=' + channel.c
  }
  // pr: 鎺ㄥ箍鏂瑰紡
  if (_my_5cu.pr) {
    url = url + '&pr=' + _my_5cu.pr
    downUrl = downUrl + '&pr=' + _my_5cu.pr
  } else {
    url = url + '&pr=' + channel.pr
    downUrl = downUrl + '&pr=' + channel.pr
  }
  Ajax.get(url, function (res) {
    console.log('page', res)
  })
  // 涓嬭浇鎸夐挳缁熻
  var allDownBtn = document.getElementsByClassName('downBtnClassId')
  for (var i = 0; i < allDownBtn.length; i++) {
    allDownBtn[i].addEventListener('click', function () {
      Ajax.get(downUrl, function (res) {
        console.log('down btn click', res)
      })
    })
  }
})()
