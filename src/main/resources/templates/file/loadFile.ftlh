<#import "../layout.ftlh" as main>
<@main.layout>
    <h2>Загрузить файл</h2>
    <form action="/file/add" method="post" enctype="multipart/form-data">
        <div>
            <label for="name">Название:</label>
            <input type="text" id="name" name="name" required>
        </div>
        <div>
            <label for="file">Файл:</label>
            <input type="file" id="file" name="file" required>
        </div>
        <div>
            <label for="status">Статус:</label>
            <select id="status" name="status" required>
                <option value="PRIVATE">Приватный</option>
                <option value="PUBLIC">Публичный</option>
            </select>
        </div>
        <div>
            <button type="submit">Загрузить</button>
        </div>
    </form>
</@main.layout>