.class public final synthetic Ll/ۢ᩶֫;
.super Ljava/lang/Object;
.source "48SH"

# interfaces
.implements Ll/ۛܶܺ;


# instance fields
.field public final synthetic ᩸:Landroid/app/Application;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Application;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۢ᩶֫;->᩸:Landroid/app/Application;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    .line 309
    new-instance v0, Ll/۟᩹֫;

    iget-object v1, p0, Ll/ۢ᩶֫;->᩸:Landroid/app/Application;

    invoke-direct {v0, v1}, Ll/۟᩹֫;-><init>(Landroid/content/ContextWrapper;)V

    return-object v0
.end method
