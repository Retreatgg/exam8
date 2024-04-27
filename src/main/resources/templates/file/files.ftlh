<#import "../layout.ftlh" as main>
<@main.layout>
    <h1 class="text-center">PUBLIC FILES</h1>
    <div class="card mt-5 border-5 pt-2 active pb-0 px-3">
        <#list numbers as number>
            <div class="card-body ">
                <div class="row">

                    <div class="col-12 ">
                        <h4 class="card-title "><b>Program Title</b></h4>

                    </div>
                    <div class="col">
                        <h6 class="card-subtitle mb-2 text-muted">
                            <p class="card-text text-muted small ">
                                <img src="https://img.icons8.com/metro/26/000000/star.png" class="mr-1 " width="19"
                                     height="19" id="star"> <span class="vl mr-2 ml-0"></span>

                                Created by <span class="font-weight-bold"> BBBootstrap Team</span> on 1 Nov , 2018</p>
                        </h6>
                    </div>

                </div>

            </div>

            <div class="card-footer bg-white px-0 ">
                <div class="row">

                    <div class=" col-md-auto ">
                        <a href="#" class="btn btn-outlined btn-black text-muted bg-transparent"
                           data-wow-delay="0.7s"><img src="https://img.icons8.com/ios/50/000000/settings.png"
                                                      width="19" height="19"> <small>SETTINGS</small></a>

                        <i class="mdi mdi-settings-outline"></i>


                        <a href="#" class="
                         btn-outlined btn-black text-muted"><img src="https://img.icons8.com/metro/26/000000/link.png"
                                                                 width="17" height="17" id="plus">
                            <small>PROGRAM LINK</small> </a>


                        <a href="#" class="btn btn-outlined btn-black text-muted "><img
                                    src="https://img.icons8.com/metro/26/000000/more.png" width="20" height="20"
                                    class="mr-2 more"><small>MORE</small></a>
                        <span class="vl ml-3"></span>
                    </div>

                </div>
            </div>
        </#list>
    </div>

</@main.layout>