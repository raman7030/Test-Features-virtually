.class public final Ll/۬۠֫;
.super Ljava/lang/Object;
.source "J8OH"

# interfaces
.implements Ll/ܶ۠֫;


# instance fields
.field public final ᩸:Ll/ۤ۠֫;

.field public final ᩹:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/app/Application;)V
    .locals 1

    .line 75
    new-instance v0, Ll/ۤ۠֫;

    invoke-direct {v0}, Ll/ۤ۠֫;-><init>()V

    .line 88
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 89
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Ll/۬۠֫;->᩹:Landroid/content/Context;

    .line 90
    iput-object v0, p0, Ll/۬۠֫;->᩸:Ll/ۤ۠֫;

    return-void
.end method


# virtual methods
.method public final ֫()Ll/᩸۠֫;
    .locals 3

    .line 113
    new-instance v0, Ll/۫۠֫;

    iget-object v1, p0, Ll/۬۠֫;->᩸:Ll/ۤ۠֫;

    .line 75
    invoke-virtual {v1}, Ll/ۤ۠֫;->֫()Ll/۟۠֫;

    move-result-object v1

    .line 114
    iget-object v2, p0, Ll/۬۠֫;->᩹:Landroid/content/Context;

    invoke-direct {v0, v2, v1}, Ll/۫۠֫;-><init>(Landroid/content/Context;Ll/᩸۠֫;)V

    return-object v0
.end method
