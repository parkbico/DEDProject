var main = {
    init : function () {
        var _this = this;
//        $('#btn-save').on('click', function () {
//            _this.save();
//        });

        $('#btn-update').on('click', function () {
            _this.update();
        });

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

//        $('#btn-delete').on('click', function () {
//            _this.delete();
//        });
    },
//    save : function () {
//        var data = {
//            title: $('#title').val(),
//            author: $('#author').val(),
//            content: $('#content').val()
//        };
//
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
//    },

    update : function () {

        console.log(" 답변 내용 저장하기");

        var files = $('input[name="files"]')[0].files;

        for(var i = 0 ; i < files.length ; i++ ){
            console.dir(files[i]);
        }
        return false;
//        var data = {
//            title: $('#title').val(),
//            content: $('#content').val()
//        };
//
//        var id = $('#id').val();

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
    },
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