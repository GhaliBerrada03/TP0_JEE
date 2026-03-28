<%@ include file="header.jsp" %>

<div class="row justify-content-center">
    <div class="col-md-6">
        <h2>Fiche Article</h2>
        <form action="${item != null ? 'stock-update' : 'stock-create'}" method="post">
            <c:if test="${item != null}">
                <input type="hidden" name="itemId" value="${item.itemId}">
            </c:if>
            
            <div class="form-group">
                <label>Désignation de l'article</label>
                <input type="text" name="itemLabel" class="form-control" value="${item.itemLabel}" required>
            </div>
            
            <div class="form-group">
                <label>Description</label>
                <textarea name="itemDescription" class="form-control">${item.itemDescription}</textarea>
            </div>
            
            <div class="form-group">
                <label>Prix de vente</label>
                <input type="number" step="0.01" name="unitPrice" class="form-control" value="${item.unitPrice}" required>
            </div>
            
            <div class="form-group">
                <label>Quantité en stock</label>
                <input type="number" name="stockQuantity" class="form-control" value="${item.stockQuantity}" required>
            </div>
            
            <button type="submit" class="btn btn-primary">Valider</button>
            <a href="inventory" class="btn btn-secondary">Retour</a>
        </form>
    </div>
</div>

<%@ include file="footer.jsp" %>
