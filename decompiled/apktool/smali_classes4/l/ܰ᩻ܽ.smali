.class public final Ll/ܰ᩻ܽ;
.super Ll/ܺᩳܽ;
.source "C4MJ"


# direct methods
.method public constructor <init>(Ll/ۛۜܽ;)V
    .locals 2

    .line 9
    invoke-virtual {p1}, Ll/ۛۜܽ;->ᩳ()I

    move-result v0

    const/16 v1, 0x80

    invoke-virtual {p1, v1}, Ll/ۛۜܽ;->ۧ(I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Ll/ܺᩳܽ;-><init>(ILjava/lang/String;)V

    return-void
.end method
