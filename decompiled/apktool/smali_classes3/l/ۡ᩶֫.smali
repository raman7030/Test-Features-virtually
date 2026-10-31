.class public final synthetic Ll/ۡ᩶֫;
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

    iput-object p1, p0, Ll/ۡ᩶֫;->᩸:Landroid/app/Application;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 4

    .line 310
    new-instance v0, Ll/᩺֫ۧ;

    new-instance v1, Ll/ᩴ᩷ۧ;

    invoke-direct {v1}, Ll/ᩴ᩷ۧ;-><init>()V

    .line 150
    new-instance v2, Ll/۬۠֫;

    iget-object v3, p0, Ll/ۡ᩶֫;->᩸:Landroid/app/Application;

    invoke-direct {v2, v3}, Ll/۬۠֫;-><init>(Landroid/app/Application;)V

    invoke-direct {v0, v2, v1}, Ll/᩺֫ۧ;-><init>(Ll/ܶ۠֫;Ll/᩶᩷ۧ;)V

    return-object v0
.end method
