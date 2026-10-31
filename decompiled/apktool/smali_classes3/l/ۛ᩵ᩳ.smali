.class public final synthetic Ll/ۛ᩵ᩳ;
.super Ljava/lang/Object;
.source "T6QN"

# interfaces
.implements Ll/۠ۜ᩵;
.implements Ll/᩸ۜ᩵;
.implements Ll/ۚۨᩳ;


# instance fields
.field public final synthetic ᩸:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۛ᩵ᩳ;->᩸:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 2
    iget-object v0, p0, Ll/ۛ᩵ᩳ;->᩸:Ljava/lang/Object;

    .line 4
    check-cast v0, Ll/ۨ᩵ᩳ;

    .line 6
    check-cast p1, Ljava/lang/Throwable;

    .line 539
    iget-object v0, v0, Ll/ۨ᩵ᩳ;->ۡ:Ll/᩻ᩴᩳ;

    invoke-virtual {v0}, Ll/᩻ᩴᩳ;->֫()Ll/ۗ᩻᩵;

    move-result-object v0

    new-instance v1, Ll/᩵ۚᩳ;

    invoke-direct {v1, p1}, Ll/᩵ۚᩳ;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ll/ۗ᩻᩵;->֫(Ll/ܶۜ᩵;)Ll/ۗ᩻᩵;

    move-result-object p1

    return-object p1
.end method

.method public ۧ(Ljava/lang/Object;Ljava/lang/Throwable;)V
    .locals 1

    .line 0
    iget-object v0, p0, Ll/ۛ᩵ᩳ;->᩸:Ljava/lang/Object;

    check-cast v0, Ll/᩵ᩴᩳ;

    check-cast p1, Ljava/lang/Void;

    invoke-static {v0, p2}, Ll/᩵ᩴᩳ;->ᩳ(Ll/᩵ᩴᩳ;Ljava/lang/Throwable;)V

    return-void
.end method
