<#import "../layout.ftlh" as main>
<@main.layout>
    <div class="container">
        <div class="our-team">
            <div class="picture">
                <img class="img-fluid" src="https://picsum.photos/130/130?image=1027">
            </div>
            <div class="team-content">
                <h3 class="name">${user.email}</h3>
            </div>
            <ul class="social">
                <li><a href="https://codepen.io/collection/XdWJOQ/" class="fa fa-facebook" aria-hidden="true"></a></li>
                <li><a href="https://codepen.io/collection/XdWJOQ/" class="fa fa-twitter" aria-hidden="true"></a></li>
                <li><a href="https://codepen.io/collection/XdWJOQ/" class="fa fa-google-plus" aria-hidden="true"></a>
                </li>
                <li><a href="https://codepen.io/collection/XdWJOQ/" class="fa fa-linkedin" aria-hidden="true"></a></li>
            </ul>
        </div>
    </div>
    <h1 class="text-center">MY FILES</h1>
    <div class="card mt-5 border-5 pt-2 active pb-0 px-3">
        <#list files as file>
            <div class="card-body ">
                <div class="row">

                    <div class="col-12 ">
                        <h4 class="card-title "><b>${file.name}</b></h4>
                    </div>

                </div>

            </div>

            <#if file.status == "PRIVATE">
                <div class="card-footer bg-white px-0 ">
                    <div class="row">
                        <h5>Status: ${file.status}</h5>

                        <div class=" col-md-auto ">
                            <a href="http://localhost:8089/files/${file.id}" class="
                         btn-outlined btn-black text-muted" download><img
                                        src="https://img.icons8.com/metro/26/000000/link.png"
                                        width="17" height="17" id="plus">
                                <small></small>Download</a>

                        </div>

                        <button id="btn"><a href="/file/generate/link/${file.name}">Generate link</a></button>

                    </div>
                </div>
            <#else>
                <div class="card-footer bg-white px-0 ">
                    <div class="row">
                        <h5>Status: ${file.status}</h5>

                        <div class=" col-md-auto ">
                            <a href="http://localhost:8089/files/${file.id}" class="
                         btn-outlined btn-black text-muted" download><img
                                        src="https://img.icons8.com/metro/26/000000/link.png"
                                        width="17" height="17" id="plus">
                                <small></small>Download</a>

                        </div>

                    </div>
                </div>
            </#if>

        </#list>
    </div>
    </div>

</@main.layout>