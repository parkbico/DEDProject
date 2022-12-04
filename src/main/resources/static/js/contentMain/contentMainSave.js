var main = {
    init : function () {
        var _this = this;
        $('#btn-save').on('click', function () {
            _this.save();
        });

        $('#btn-update').on('click', function () {
            _this.update();
        });

        $('#btn-delete').on('click', function () {
            _this.delete();
        });

        //파일 등록 시 하단에 등록된 파일 목록 붙이기
        $('#files').on('change' , function(){
            console.log("변화가 있었다.");
            var fileInput =  $('input[name="files"]');

            for( var i=0; i<fileInput.length; i++ ){
                if( fileInput[i].files.length > 0 ){
                    for( var j = 0; j < fileInput[i].files.length; j++ ){
                        console.dir(fileInput[i].files[j].name); // 파일명 출력
                        // 파일명 하단의 목록에 보여주게 하기
                        // 목록에서 선택한 파일 없애기 ,, file 전역 변수로 만들어서 보관해뒀다가 삭제하면 리스트에서 제거
                    }
                }
            }
        });
    },
    save : function () {
        var data = {
            title: $('#title').val(),
            author: $('#author').val(),
            content: $('#content').val(),
        };

        var files = $('input[name="files"]')[0].files;

        console.dir(files);


//        $.ajax({
//            type: 'POST',
//            url: '/api/v1/posts',
//            dataType: 'json',
//            contentType:'application/json; charset=utf-8',
//            data: JSON.stringify(data)
//        }).done(function() {
//            alert('글이 등록되었습니다.');
//            window.location.href = '/';
//        }).fail(function (error) {
//            alert(JSON.stringify(error));
//        });
    },
//    update : function () {
//        var data = {
//            title: $('#title').val(),
//            content: $('#content').val()
//        };
//
//        var id = $('#id').val();
//
//        $.ajax({
//            type: 'PUT',
//            url: '/api/v1/posts/'+id,
//            dataType: 'json',
//            contentType:'application/json; charset=utf-8',
//            data: JSON.stringify(data)
//        }).done(function() {
//            alert('글이 수정되었습니다.');
//            window.location.href = '/';
//        }).fail(function (error) {
//            alert(JSON.stringify(error));
//        });
//    },
//    delete : function () {
//        var id = $('#id').val();
//
//        $.ajax({
//            type: 'DELETE',
//            url: '/api/v1/posts/'+id,
//            dataType: 'json',
//            contentType:'application/json; charset=utf-8'
//        }).done(function() {
//            alert('글이 삭제되었습니다.');
//            window.location.href = '/';
//        }).fail(function (error) {
//            alert(JSON.stringify(error));
//        });
//    }

};

main.init();