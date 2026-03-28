<%@ include file="header.jsp" %>

<div class="jumbotron text-center">
    <h1 class="display-4">Bienvenue sur MyStockApp</h1>
    <p class="lead">Votre solution simple pour la gestion d'inventaire et des utilisateurs.</p>
    <hr class="my-4">
    <div class="row mt-5">
        <div class="col-md-6">
            <div class="card">
                <div class="card-body">
                    <h5 class="card-title">Gestion Utilisateurs</h5>
                    <p class="card-text">Gérez les accès et les profils des utilisateurs de l'application.</p>
                    <a href="app-users" class="btn btn-primary">Ouvrir la liste</a>
                </div>
            </div>
        </div>
        <div class="col-md-6">
            <div class="card">
                <div class="card-body">
                    <h5 class="card-title">Gestion de Stock</h5>
                    <p class="card-text">Consultez et mettez à jour l'inventaire des articles disponibles.</p>
                    <a href="inventory" class="btn btn-primary">Voir le stock</a>
                </div>
            </div>
        </div>
    </div>
</div>

<%@ include file="footer.jsp" %>
