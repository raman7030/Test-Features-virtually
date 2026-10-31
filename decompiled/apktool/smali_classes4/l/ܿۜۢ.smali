.class public final synthetic Ll/ܿۜۢ;
.super Ljava/lang/Object;
.source "M1KQ"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/ۜۜۢ;


# direct methods
.method public synthetic constructor <init>(Ll/ۜۜۢ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܿۜۢ;->᩸:Ll/ۜۜۢ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 159
    iget-object v0, p0, Ll/ܿۜۢ;->᩸:Ll/ۜۜۢ;

    iget-object v1, v0, Ll/ۜۜۢ;->᩻:Ll/᩺ۤܿ;

    invoke-virtual {v1}, Ll/᩺ۤܿ;->ܽ()V

    .line 160
    iget-object v1, v0, Ll/ۜۜۢ;->᩻:Ll/᩺ۤܿ;

    const v2, 0x7f1207a7

    invoke-virtual {v1, v2}, Ll/᩺ۤܿ;->ܽ(I)V

    .line 161
    iget-object v0, v0, Ll/ۜۜۢ;->᩻:Ll/᩺ۤܿ;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ll/᩺ۤܿ;->֫(Z)V

    return-void
.end method
