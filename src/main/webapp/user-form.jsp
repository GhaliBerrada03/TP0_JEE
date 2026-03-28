<%@ include file="header.jsp" %>

<div class="row justify-content-center">
    <div class="col-md-6">
        <h2>${user != null ? 'Editer Utilisateur' : 'Nouvel Utilisateur'}</h2>
        <form action="${user != null ? 'app-user-update' : 'app-user-create'}" method="post">
            <c:if test="${user != null}">
                <input type="hidden" name="id" value="${user.id}">
            </c:if>
            
            <div class="form-group">
                <label>Nom Complet</label>
                <input type="text" name="fullName" class="form-control" value="${user.fullName}" required>
            </div>
            
            <div class="form-group">
                <label>Email de connexion</label>
                <input type="email" name="loginEmail" class="form-control" value="${user.loginEmail}" required>
            </div>
            
            <c:if test="${user == null}">
                <div class="form-group">
                    <label>Mot de passe</label>
                    <input type="password" name="userPassword" class="form-control" required>
                </div>
            </c:if>
            
            <button type="submit" class="btn btn-success">Enregistrer</button>
            <a href="app-users" class="btn btn-secondary">Annuler</a>
        </form>
    </div>
</div>

<%@ include file="footer.jsp" %>
