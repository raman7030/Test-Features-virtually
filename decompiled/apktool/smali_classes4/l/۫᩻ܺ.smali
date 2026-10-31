.class public final Ll/۫᩻ܺ;
.super Ljava/lang/Object;
.source "O69P"

# interfaces
.implements Ll/᩹ܿܺ;


# instance fields
.field public final synthetic ֫:Ll/֫ۜܺ;


# direct methods
.method public constructor <init>(Ll/֫ۜܺ;)V
    .locals 0

    .line 215
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۫᩻ܺ;->֫:Ll/֫ۜܺ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܰۡܺ;)I
    .locals 1

    .line 218
    iget-object v0, p0, Ll/۫᩻ܺ;->֫:Ll/֫ۜܺ;

    invoke-virtual {v0, p1}, Ll/֫ۜܺ;->֫(Ll/ܰۡܺ;)Ll/ܺۜܺ;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, -0x1

    return p1

    .line 222
    :cond_0
    invoke-virtual {p1}, Ll/ܺۜܺ;->ܿ()I

    move-result p1

    return p1
.end method
