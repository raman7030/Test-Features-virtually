.class public final Ll/ۚ᩹ܽ;
.super Ll/۬ۗܿ;
.source "P676"


# instance fields
.field public final synthetic ۟:Ll/᩷᩶ܽ;


# direct methods
.method public constructor <init>(Ll/᩷᩶ܽ;Ll/᩷᩶ܽ;)V
    .locals 0

    .line 842
    iput-object p1, p0, Ll/ۚ᩹ܽ;->۟:Ll/᩷᩶ܽ;

    const/4 p1, -0x1

    .line 40
    invoke-direct {p0, p2, p1}, Ll/۬ۗܿ;-><init>(Ll/ۗܺ᩷;I)V

    return-void
.end method


# virtual methods
.method public final ᩴ()V
    .locals 3

    .line 845
    iget-object v0, p0, Ll/ۚ᩹ܽ;->۟:Ll/᩷᩶ܽ;

    invoke-static {v0}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v1

    iget-object v1, v1, Ll/ᩳ᩶ܽ;->ۢ֫:[Ll/ۨۙ֡;

    invoke-static {v0}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v2

    iget v2, v2, Ll/ᩳ᩶ܽ;->ۡ֫:I

    aget-object v1, v1, v2

    invoke-virtual {p0}, Ll/۬ۗܿ;->ۢ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/ۨۙ֡;->֫(Ljava/lang/String;)V

    const/4 v1, 0x1

    .line 846
    sput-boolean v1, Ll/᩷᩶ܽ;->ܺۧ:Z

    .line 847
    invoke-static {v0}, Ll/᩷᩶ܽ;->ۧ(Ll/᩷᩶ܽ;)Ll/۫᩵ۘ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۙ᩵ۘ;->notifyDataSetChanged()V

    .line 848
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۧ()V

    return-void
.end method
