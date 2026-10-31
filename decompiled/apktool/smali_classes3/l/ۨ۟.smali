.class public final Ll/ۨ۟;
.super Ljava/lang/Object;
.source "23DC"


# instance fields
.field public final ֫:Ll/ۛ۟;


# direct methods
.method public constructor <init>(Landroid/net/Uri;Landroid/content/ClipDescription;Landroid/net/Uri;)V
    .locals 2

    .line 167
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 168
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x19

    if-lt v0, v1, :cond_0

    .line 169
    new-instance v0, Ll/۫۟;

    invoke-direct {v0, p1, p2, p3}, Ll/۫۟;-><init>(Landroid/net/Uri;Landroid/content/ClipDescription;Landroid/net/Uri;)V

    iput-object v0, p0, Ll/ۨ۟;->֫:Ll/ۛ۟;

    return-void

    .line 171
    :cond_0
    new-instance v0, Ll/ۤ۟;

    invoke-direct {v0, p1, p2, p3}, Ll/ۤ۟;-><init>(Landroid/net/Uri;Landroid/content/ClipDescription;Landroid/net/Uri;)V

    iput-object v0, p0, Ll/ۨ۟;->֫:Ll/ۛ۟;

    return-void
.end method

.method public constructor <init>(Ll/۫۟;)V
    .locals 0

    .line 175
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 176
    iput-object p1, p0, Ll/ۨ۟;->֫:Ll/ۛ۟;

    return-void
.end method

.method public static ֫(Ljava/lang/Object;)Ll/ۨ۟;
    .locals 2

    if-nez p0, :cond_0

    goto :goto_0

    .line 220
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x19

    if-ge v0, v1, :cond_1

    :goto_0
    const/4 p0, 0x0

    return-object p0

    .line 223
    :cond_1
    new-instance v0, Ll/ۨ۟;

    new-instance v1, Ll/۫۟;

    invoke-direct {v1, p0}, Ll/۫۟;-><init>(Ljava/lang/Object;)V

    invoke-direct {v0, v1}, Ll/ۨ۟;-><init>(Ll/۫۟;)V

    return-object v0
.end method


# virtual methods
.method public final ֫()Landroid/net/Uri;
    .locals 1

    .line 184
    iget-object v0, p0, Ll/ۨ۟;->֫:Ll/ۛ۟;

    invoke-interface {v0}, Ll/ۛ۟;->ۧ()Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ()Landroid/content/ClipDescription;
    .locals 1

    .line 194
    iget-object v0, p0, Ll/ۨ۟;->֫:Ll/ۛ۟;

    invoke-interface {v0}, Ll/ۛ۟;->getDescription()Landroid/content/ClipDescription;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ()Landroid/net/Uri;
    .locals 1

    .line 202
    iget-object v0, p0, Ll/ۨ۟;->֫:Ll/ۛ۟;

    invoke-interface {v0}, Ll/ۛ۟;->ᩳ()Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method public final ܿ()Ljava/lang/Object;
    .locals 1

    .line 236
    iget-object v0, p0, Ll/ۨ۟;->֫:Ll/ۛ۟;

    invoke-interface {v0}, Ll/ۛ۟;->֫()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final ᩳ()V
    .locals 1

    .line 249
    iget-object v0, p0, Ll/ۨ۟;->֫:Ll/ۛ۟;

    invoke-interface {v0}, Ll/ۛ۟;->ܽ()V

    return-void
.end method
