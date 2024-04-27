<#import "../layout.ftlh" as main>
<@main.layout>
    <h1 class="text-center">PUBLIC FILES</h1>
    <div class="card mt-5 border-5 pt-2 active pb-0 px-3">
        <#list files as file>
            <div class="card-body ">
                <div class="row">

                    <div class="col-12 ">
                        <h4 class="card-title "><b>${file.name}</b></h4>
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
        </#list>
    </div>

</@main.layout>