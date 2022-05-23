var id = document.querySelector(".ddd");
id.addEventListener("click",amDelete());

function amDelete(){
    $.ajax({
        type: "Get",
        url: "axmDelete",
        data: {
            id:id
        },
        success:function(result) {
            if(result.code == '200'){
                alert("삭제가 정상적으로 처리되었습니다.")
                //span의 컨텐츠를 deleted로 변경
                //$(this).html('Deleted'); ajax처리단계이므로 이미 this 는 변경되어 click시의 this가 아님 그러므로 id 활용
                $('#'+id).html('Deleted').css({
                    "color" : "red",
                    fontWeight : "bold"
                }).off();
                // .off() 이벤트 제거 (적용됨), removeClass는 적용안됨.
            }else if (result.code == '201'){
                alert("삭제를 실패하였습니다. 서버오류")
            }else{
                alert("로그인 정보가 관리자가 아닙니다.")
            }
        },
        error : function() {
            $('#result_Area2').html('');
            alert ('서버연결에 실패하였습니다 => Delete');
        }
    });
}