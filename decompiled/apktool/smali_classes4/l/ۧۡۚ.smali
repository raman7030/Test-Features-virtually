.class public final Ll/ۧۡۚ;
.super Ljava/lang/Object;
.source "05ZW"

# interfaces
.implements Ll/ܽܶܺ;


# instance fields
.field public final synthetic ᩸:Ll/ᩳۡۚ;


# direct methods
.method public constructor <init>(Ll/ᩳۡۚ;)V
    .locals 0

    .line 71
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۧۡۚ;->᩸:Ll/ᩳۡۚ;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 71
    check-cast p1, Ljava/lang/CharSequence;

    .line 75
    iget-object v0, p0, Ll/ۧۡۚ;->᩸:Ll/ᩳۡۚ;

    iget-object v0, v0, Ll/ܽ᩷ۚ;->֫:Ll/᩵ۡۚ;

    iget-object v0, v0, Ll/᩸ۜۚ;->᩻֫:Ll/ܳۡۚ;

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ܳۡۚ;->֫(Ljava/lang/String;)Ll/᩻ۡۚ;

    move-result-object p1

    return-object p1
.end method
