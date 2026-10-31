.class public final synthetic Ll/ܺ᩻֫;
.super Ljava/lang/Object;
.source "O4XG"

# interfaces
.implements Ll/۠۫ۧ;


# instance fields
.field public final synthetic ֫:Ll/֡᩻֫;


# direct methods
.method public synthetic constructor <init>(Ll/֡᩻֫;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܺ᩻֫;->֫:Ll/֡᩻֫;

    return-void
.end method


# virtual methods
.method public final ֫()Landroid/os/Bundle;
    .locals 2

    .line 2
    sget v0, Ll/֡᩻֫;->ۖ֫:I

    .line 130
    iget-object v0, p0, Ll/ܺ᩻֫;->֫:Ll/֡᩻֫;

    invoke-virtual {v0}, Ll/֡᩻֫;->ۡ()V

    .line 131
    iget-object v0, v0, Ll/֡᩻֫;->᩷֫:Ll/᩷ۡ֫;

    sget-object v1, Ll/᩺ۢ֫;->ۛ:Ll/᩺ۢ֫;

    invoke-virtual {v0, v1}, Ll/᩷ۡ֫;->֫(Ll/᩺ۢ֫;)V

    .line 132
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    return-object v0
.end method
