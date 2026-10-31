.class public final synthetic Ll/ۙۙܳ;
.super Ljava/lang/Object;
.source "Y4UF"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۗ:I

.field public final synthetic ۙ:Ll/ܽ᩷ܳ;

.field public final synthetic ۬:Ll/ۨܺ᩷;

.field public final synthetic ᩶:Ll/ۧۜܳ;

.field public final synthetic ᩸:Ll/۫ۙܳ;

.field public final synthetic ᩹:Ll/ۢۢۡ;


# direct methods
.method public synthetic constructor <init>(Ll/۫ۙܳ;Ll/ۢۢۡ;Ll/ۧۜܳ;Ll/ܽ᩷ܳ;ILl/ۨܺ᩷;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۙۙܳ;->᩸:Ll/۫ۙܳ;

    iput-object p2, p0, Ll/ۙۙܳ;->᩹:Ll/ۢۢۡ;

    iput-object p3, p0, Ll/ۙۙܳ;->᩶:Ll/ۧۜܳ;

    iput-object p4, p0, Ll/ۙۙܳ;->ۙ:Ll/ܽ᩷ܳ;

    iput p5, p0, Ll/ۙۙܳ;->ۗ:I

    iput-object p6, p0, Ll/ۙۙܳ;->۬:Ll/ۨܺ᩷;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 0
    iget v4, p0, Ll/ۙۙܳ;->ۗ:I

    iget-object v5, p0, Ll/ۙۙܳ;->۬:Ll/ۨܺ᩷;

    iget-object v0, p0, Ll/ۙۙܳ;->᩸:Ll/۫ۙܳ;

    iget-object v1, p0, Ll/ۙۙܳ;->᩹:Ll/ۢۢۡ;

    iget-object v2, p0, Ll/ۙۙܳ;->᩶:Ll/ۧۜܳ;

    iget-object v3, p0, Ll/ۙۙܳ;->ۙ:Ll/ܽ᩷ܳ;

    invoke-static/range {v0 .. v5}, Ll/۫ۙܳ;->֫(Ll/۫ۙܳ;Ll/ۢۢۡ;Ll/ۧۜܳ;Ll/ܽ᩷ܳ;ILl/ۨܺ᩷;)V

    return-void
.end method
