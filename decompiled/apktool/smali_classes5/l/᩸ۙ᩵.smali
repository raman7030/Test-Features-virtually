.class public final Ll/᩸ۙ᩵;
.super Ljava/lang/Object;
.source "S4VX"

# interfaces
.implements Ll/ܳۙ᩵;


# instance fields
.field public final ֫:Ll/ܰۙ᩵;

.field public final ۧ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ll/ܰۙ᩵;)V
    .locals 0

    .line 1209
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1210
    iput-object p1, p0, Ll/᩸ۙ᩵;->ۧ:Ljava/lang/String;

    .line 1213
    iput-object p2, p0, Ll/᩸ۙ᩵;->֫:Ll/ܰۙ᩵;

    return-void
.end method

.method public static final synthetic ֫(Ll/᩸ۙ᩵;)Ll/᩵᩹᩵;
    .locals 0

    .line 1209
    iget-object p0, p0, Ll/᩸ۙ᩵;->֫:Ll/ܰۙ᩵;

    return-object p0
.end method

.method public static final synthetic ۧ(Ll/᩸ۙ᩵;)Ljava/lang/CharSequence;
    .locals 0

    .line 1209
    iget-object p0, p0, Ll/᩸ۙ᩵;->ۧ:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1216
    new-instance v0, Ll/ܶۙ᩵;

    invoke-direct {v0, p0}, Ll/ܶۙ᩵;-><init>(Ll/᩸ۙ᩵;)V

    return-object v0
.end method
