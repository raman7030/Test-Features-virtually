.class public final synthetic Ll/ܿ᩻۠;
.super Ljava/lang/Object;
.source "Z5U8"

# interfaces
.implements Ljava/util/function/IntFunction;


# instance fields
.field public final synthetic ᩸:Ll/᩶ۜ۠;


# direct methods
.method public synthetic constructor <init>(Ll/᩶ۜ۠;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܿ᩻۠;->᩸:Ll/᩶ۜ۠;

    return-void
.end method


# virtual methods
.method public final apply(I)Ljava/lang/Object;
    .locals 2

    .line 2541
    iget-object v0, p0, Ll/ܿ᩻۠;->᩸:Ll/᩶ۜ۠;

    iget-object v1, v0, Ll/᩶ۜ۠;->۬:Ll/᩶ۢ۠;

    invoke-virtual {v1, p1}, Ll/᩶ۢ۠;->֫(I)Ll/ܳ֡֨;

    move-result-object p1

    iget-object v0, v0, Ll/᩶ۜ۠;->ۜ֫:Ll/ۛ᩸֨;

    invoke-virtual {p1, v0}, Ll/ܳ֡֨;->ܽ(Ll/ۛ᩸֨;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1
.end method
