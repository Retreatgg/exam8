<#import "../layout.ftlh" as main>
<@main.layout>
    <div class="card-body ">
        <div class="row">

            <div class="col-12 ">
                <h4 class="card-title "><b>${file.fileName}</b></h4>
            </div>

        </div>

    </div>

    <div class="card-footer bg-white px-0 ">
        <div class="row">

            <div class=" col-md-auto ">
                <a href="http://localhost:8089/files/${file.id}" class="
                         btn-outlined btn-black text-muted" download><img src="https://img.icons8.com/metro/26/000000/link.png"
                                                                          width="17" height="17" id="plus">
                    <small></small>Download</a>

            </div>

        </div>
    </div>
</@main.layout>