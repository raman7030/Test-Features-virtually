.class public final Ll/ᩴܶۖ;
.super Ll/᩻᩶ۚ;
.source "44YS"


# instance fields
.field public final synthetic ܽ:Ljava/lang/String;

.field public final synthetic ܿ:Ll/᩻᩶ۚ;

.field public final synthetic ᩳ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/᩻᩶ۚ;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 554
    iput-object p1, p0, Ll/ᩴܶۖ;->ܿ:Ll/᩻᩶ۚ;

    iput-object p2, p0, Ll/ᩴܶۖ;->ᩳ:Ljava/lang/String;

    iput-object p3, p0, Ll/ᩴܶۖ;->ܽ:Ljava/lang/String;

    invoke-direct {p0}, Ll/᩻᩶ۚ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩶ۚ;
    .locals 9

    .line 558
    invoke-static {}, Ll/֨ܶۖ;->֫()Ljava/util/HashSet;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 559
    new-instance p1, Ll/ۘܶۖ;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/ᩴܶۖ;->ᩳ:Ljava/lang/String;

    const-string v2, "$"

    .line 0
    invoke-static {v0, v1, v2, p2}, Ll/᩺᩵ܿ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 560
    iget-object v3, p0, Ll/ᩴܶۖ;->ܿ:Ll/᩻᩶ۚ;

    const/16 v4, 0xa

    move-object v6, p3

    move-object v7, p4

    move-object v8, p5

    invoke-virtual/range {v3 .. v8}, Ll/᩻᩶ۚ;->֫(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩶ۚ;

    move-result-object p2

    invoke-direct {p1, p0, p2}, Ll/ۘܶۖ;-><init>(Ll/ᩴܶۖ;Ll/ܶ᩶ۚ;)V

    return-object p1

    .line 574
    :cond_0
    invoke-super/range {p0 .. p5}, Ll/᩻᩶ۚ;->֫(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩶ۚ;

    move-result-object p1

    return-object p1
.end method
