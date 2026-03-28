<%@ include file="header.jsp" %>

<div class="row">
    <div class="col-md-12">
        <h2>Gestion de l'Inventaire</h2>
        
        <div class="mb-3">
            <form action="inventory" method="get" class="form-inline">
                <input type="text" name="query" class="form-control mr-sm-2" placeholder="Rechercher par libellé..." value="${query}">
                <button type="submit" class="btn btn-outline-primary">Rechercher</button>
                <a href="inventory" class="btn btn-link">Réinitialiser</a>
            </form>
        </div>

        <a href="stock-form" class="btn btn-primary mb-3">Ajouter Article</a>
        
        <table class="table table-hover">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Libellé</th>
                    <th>Prix Unit.</th>
                    <th>Quantité</th>
                    <th>Actions</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="item" items="${items}">
                    <tr class="${item.stockQuantity < 5 ? 'table-warning' : ''}">
                        <td>${item.itemId}</td>
                        <td>${item.itemLabel}</td>
                        <td>${item.unitPrice} €</td>
                        <td>${item.stockQuantity}</td>
                        <td>
                            <a href="stock-form?id=${item.itemId}" class="btn btn-sm btn-info">Editer</a>
                            <a href="stock-delete?id=${item.itemId}" class="btn btn-sm btn-danger" onclick="return confirm('Confirmer suppression?')">Vider</a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</div>

<%@ include file="footer.jsp" %>
