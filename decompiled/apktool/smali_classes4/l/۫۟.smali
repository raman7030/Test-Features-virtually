.class public final Ll/۫۟;
.super Ljava/lang/Object;
.source "23DC"

# interfaces
.implements Ll/ۛ۟;


# instance fields
.field public final ֫:Landroid/view/inputmethod/InputContentInfo;


# direct methods
.method public constructor <init>(Landroid/net/Uri;Landroid/content/ClipDescription;Landroid/net/Uri;)V
    .locals 1

    .line 112
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 113
    new-instance v0, Landroid/view/inputmethod/InputContentInfo;

    invoke-direct {v0, p1, p2, p3}, Landroid/view/inputmethod/InputContentInfo;-><init>(Landroid/net/Uri;Landroid/content/ClipDescription;Landroid/net/Uri;)V

    iput-object v0, p0, Ll/۫۟;->֫:Landroid/view/inputmethod/InputContentInfo;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 107
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 108
    check-cast p1, Landroid/view/inputmethod/InputContentInfo;

    iput-object p1, p0, Ll/۫۟;->֫:Landroid/view/inputmethod/InputContentInfo;

    return-void
.end method


# virtual methods
.method public final getDescription()Landroid/content/ClipDescription;
    .locals 1

    .line 125
    iget-object v0, p0, Ll/۫۟;->֫:Landroid/view/inputmethod/InputContentInfo;

    invoke-virtual {v0}, Landroid/view/inputmethod/InputContentInfo;->getDescription()Landroid/content/ClipDescription;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ljava/lang/Object;
    .locals 1

    .line 137
    iget-object v0, p0, Ll/۫۟;->֫:Landroid/view/inputmethod/InputContentInfo;

    return-object v0
.end method

.method public final ۧ()Landroid/net/Uri;
    .locals 1

    .line 119
    iget-object v0, p0, Ll/۫۟;->֫:Landroid/view/inputmethod/InputContentInfo;

    invoke-virtual {v0}, Landroid/view/inputmethod/InputContentInfo;->getContentUri()Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ()V
    .locals 1

    .line 142
    iget-object v0, p0, Ll/۫۟;->֫:Landroid/view/inputmethod/InputContentInfo;

    invoke-virtual {v0}, Landroid/view/inputmethod/InputContentInfo;->requestPermission()V

    return-void
.end method

.method public final ᩳ()Landroid/net/Uri;
    .locals 1

    .line 131
    iget-object v0, p0, Ll/۫۟;->֫:Landroid/view/inputmethod/InputContentInfo;

    invoke-virtual {v0}, Landroid/view/inputmethod/InputContentInfo;->getLinkUri()Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method
