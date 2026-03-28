<%@ include file="header.jsp" %>

<div class="row">
    <div class="col-md-12">
        <h2>Liste des Utilisateurs</h2>
        <a href="app-user-form" class="btn btn-primary mb-3">Ajouter Nouveau</a>
        
        <table class="table table-bordered">
            <thead class="thead-light">
                <tr>
                    <th>ID</th>
                    <th>Nom Complet</th>
                    <th>Email</th>
                    <th>Date d'inscription</th>
                    <th>Actions</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="u" items="${userList}">
                    <tr>
                        <td>${u.id}</td>
                        <td>${u.fullName}</td>
                        <td>${u.loginEmail}</td>
                        <td>${u.registrationDate}</td>
                        <td>
                            <a href="app-user-form?id=${u.id}" class="btn btn-sm btn-info">Modifier</a>
                            <a href="app-user-delete?id=${u.id}" class="btn btn-sm btn-danger" onclick="return confirm('Supprimer?')">Supprimer</a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</div>

<%@ include file="footer.jsp" %>
