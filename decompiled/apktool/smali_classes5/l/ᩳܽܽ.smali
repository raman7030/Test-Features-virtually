.class public final Ll/ᩳܽܽ;
.super Ljava/lang/Object;
.source "MAMP"

# interfaces
.implements Ll/۟ۧܽ;


# instance fields
.field public final ۧ:Ll/ۨۧܽ;


# direct methods
.method public constructor <init>(Ll/᩻ܽܽ;Ll/ۨۧܽ;)V
    .locals 1

    const-string v0, "windowMetricsCalculator"

    .line 6
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-object p2, p0, Ll/ᩳܽܽ;->ۧ:Ll/ۨۧܽ;

    return-void
.end method

.method public static final synthetic ֫(Ll/ᩳܽܽ;)Ll/ۨۧܽ;
    .locals 0

    .line 34
    iget-object p0, p0, Ll/ᩳܽܽ;->ۧ:Ll/ۨۧܽ;

    return-object p0
.end method


# virtual methods
.method public final ֫(Landroid/app/Activity;)Ll/ᩴۤ᩵;
    .locals 2

    .line 46
    new-instance v0, Ll/ܽܽܽ;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Ll/ܽܽܽ;-><init>(Ll/ᩳܽܽ;Landroid/app/Activity;Ll/ۨܶ᩵;)V

    invoke-static {v0}, Ll/֡ۤ᩵;->֫(Ll/᩵᩹᩵;)Ll/ᩴۤ᩵;

    move-result-object p1

    return-object p1
.end method
