.class public final synthetic Ll/ܳۚ᩷;
.super Ljava/lang/Object;
.source "E72G"

# interfaces
.implements Landroid/webkit/ValueCallback;


# instance fields
.field public final synthetic ֫:Ll/֨ۚ᩷;

.field public final synthetic ۧ:Landroid/os/Bundle;


# direct methods
.method public synthetic constructor <init>(Ll/֨ۚ᩷;Landroid/os/Bundle;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܳۚ᩷;->֫:Ll/֨ۚ᩷;

    iput-object p2, p0, Ll/ܳۚ᩷;->ۧ:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final onReceiveValue(Ljava/lang/Object;)V
    .locals 2

    .line 0
    iget-object v0, p0, Ll/ܳۚ᩷;->ۧ:Landroid/os/Bundle;

    check-cast p1, Ljava/lang/String;

    iget-object v1, p0, Ll/ܳۚ᩷;->֫:Ll/֨ۚ᩷;

    invoke-static {v1, v0, p1}, Ll/֨ۚ᩷;->֫(Ll/֨ۚ᩷;Landroid/os/Bundle;Ljava/lang/String;)V

    return-void
.end method
