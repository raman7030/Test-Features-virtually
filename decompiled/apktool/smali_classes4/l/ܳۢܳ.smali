.class public final synthetic Ll/ܳۢܳ;
.super Ljava/lang/Object;
.source "M292"

# interfaces
.implements Ll/᩷ۢܳ;


# instance fields
.field public final synthetic ᩸:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܳۢܳ;->᩸:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ᩳۜܳ;)Z
    .locals 1

    .line 104
    invoke-interface {p1}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Ll/ܳۢܳ;->᩸:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method
