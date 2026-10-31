.class public final Ll/֡ܿ;
.super Ljava/lang/Object;
.source "V4WV"

# interfaces
.implements Ll/۠۫ۧ;


# instance fields
.field public final synthetic ֫:Ll/֨ܿ;


# direct methods
.method public constructor <init>(Ll/֨ܿ;)V
    .locals 0

    .line 119
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֡ܿ;->֫:Ll/֨ܿ;

    return-void
.end method


# virtual methods
.method public final ֫()Landroid/os/Bundle;
    .locals 2

    .line 123
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 124
    iget-object v1, p0, Ll/֡ܿ;->֫:Ll/֨ܿ;

    invoke-virtual {v1}, Ll/֨ܿ;->ܺ()Ll/۬ܿ;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object v0
.end method
