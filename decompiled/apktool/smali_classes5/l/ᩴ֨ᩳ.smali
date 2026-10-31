.class public final synthetic Ll/ᩴ֨ᩳ;
.super Ljava/lang/Object;
.source "3B3L"

# interfaces
.implements Ll/۠ۜ᩵;


# instance fields
.field public final synthetic ᩸:Ll/᩶ܶᩳ;


# direct methods
.method public synthetic constructor <init>(Ll/᩶ܶᩳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩴ֨ᩳ;->᩸:Ll/᩶ܶᩳ;

    return-void
.end method


# virtual methods
.method public final ۧ(Ljava/lang/Object;Ljava/lang/Throwable;)V
    .locals 0

    .line 2
    check-cast p1, Ljava/lang/Void;

    if-eqz p2, :cond_0

    .line 718
    iget-object p1, p0, Ll/ᩴ֨ᩳ;->᩸:Ll/᩶ܶᩳ;

    if-eqz p1, :cond_0

    invoke-virtual {p1, p2}, Ll/᩶ܶᩳ;->֫(Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method
