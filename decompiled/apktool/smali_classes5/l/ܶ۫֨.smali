.class public abstract Ll/ܶ۫֨;
.super Ll/ܳ֨۠;
.source "W7SR"


# instance fields
.field public final ֫:Ll/ܰܰ֨;


# direct methods
.method public constructor <init>(Ljava/util/EnumSet;)V
    .locals 2

    .line 3437
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1108
    new-instance v0, Ll/ܰܰ֨;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p1}, Ll/ܰܰ֨;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, Ll/ܶ۫֨;->֫:Ll/ܰܰ֨;

    return-void
.end method


# virtual methods
.method public final ۧ(Ll/ۚۚ۠;)V
    .locals 1

    if-eqz p1, :cond_1

    .line 1114
    iget-object v0, p0, Ll/ܶ۫֨;->֫:Ll/ܰܰ֨;

    invoke-virtual {v0, p1}, Ll/ܰܰ֨;->test(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 49
    invoke-virtual {p1, p0}, Ll/ۚۚ۠;->֫(Ll/֡ۚ۠;)V

    return-void

    .line 1117
    :cond_0
    invoke-virtual {p0}, Ll/ܶ۫֨;->ᩳ()V

    :cond_1
    return-void
.end method

.method public ᩳ()V
    .locals 0

    return-void
.end method
