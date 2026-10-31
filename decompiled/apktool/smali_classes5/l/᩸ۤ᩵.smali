.class public final Ll/᩸ۤ᩵;
.super Ll/ۡۤ᩵;
.source "QAL8"


# instance fields
.field public final ᩸:Ll/᩵᩹᩵;


# direct methods
.method public constructor <init>(Ll/᩵᩹᩵;)V
    .locals 0

    .line 224
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    iput-object p1, p0, Ll/᩸ۤ᩵;->᩸:Ll/᩵᩹᩵;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۬ۤ᩵;Ll/ۨܶ᩵;)Ljava/lang/Object;
    .locals 1

    .line 61
    iget-object v0, p0, Ll/᩸ۤ᩵;->᩸:Ll/᩵᩹᩵;

    invoke-interface {v0, p1, p2}, Ll/᩵᩹᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 57
    sget-object p2, Ll/ۜ᩸᩵;->᩶:Ll/ۜ᩸᩵;

    if-ne p1, p2, :cond_0

    return-object p1

    .line 61
    :cond_0
    sget-object p1, Ll/۠۠᩵;->֫:Ll/۠۠᩵;

    return-object p1
.end method
