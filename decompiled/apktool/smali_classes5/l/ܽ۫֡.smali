.class public final Ll/ܽ۫֡;
.super Ll/ۢ۬֡;
.source "S515"


# instance fields
.field public final ֫:Ll/ܿ۫֡;

.field public final ۧ:Ll/ܰ۬֡;

.field public final ܽ:Ll/ܿ۫֡;


# direct methods
.method public constructor <init>(Ll/ܿ۫֡;Ll/ܿ۫֡;Ll/ܰ۬֡;)V
    .locals 0

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 76
    iput-object p1, p0, Ll/ܽ۫֡;->ܽ:Ll/ܿ۫֡;

    .line 77
    iput-object p2, p0, Ll/ܽ۫֡;->֫:Ll/ܿ۫֡;

    .line 78
    iput-object p3, p0, Ll/ܽ۫֡;->ۧ:Ll/ܰ۬֡;

    return-void
.end method

.method public constructor <init>(Ll/ܿ۫֡;Ll/ܿ۫֡;Ll/ܿ۫֡;)V
    .locals 0

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 70
    iput-object p1, p0, Ll/ܽ۫֡;->ܽ:Ll/ܿ۫֡;

    .line 71
    iput-object p2, p0, Ll/ܽ۫֡;->֫:Ll/ܿ۫֡;

    .line 74
    new-instance p1, Ll/᩺۬֡;

    invoke-direct {p1, p3}, Ll/ܰ۬֡;-><init>(Ll/ܿ۫֡;)V

    .line 72
    iput-object p1, p0, Ll/ܽ۫֡;->ۧ:Ll/ܰ۬֡;

    return-void
.end method

.method public constructor <init>(Ll/ܿ۫֡;Ll/ܿ۫֡;Ll/᩸ܽۚ;Ll/ܿ۫֡;)V
    .locals 0

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    iput-object p1, p0, Ll/ܽ۫֡;->ܽ:Ll/ܿ۫֡;

    .line 65
    iput-object p2, p0, Ll/ܽ۫֡;->֫:Ll/ܿ۫֡;

    if-nez p3, :cond_0

    .line 74
    new-instance p1, Ll/᩺۬֡;

    invoke-direct {p1, p4}, Ll/ܰ۬֡;-><init>(Ll/ܿ۫֡;)V

    goto :goto_0

    .line 53
    :cond_0
    new-instance p1, Ll/ۨ۬֡;

    invoke-direct {p1, p4, p3}, Ll/ۨ۬֡;-><init>(Ll/ܿ۫֡;Ll/᩸ܽۚ;)V

    .line 66
    :goto_0
    iput-object p1, p0, Ll/ܽ۫֡;->ۧ:Ll/ܰ۬֡;

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 83
    iget-object v0, p0, Ll/ܽ۫֡;->ܽ:Ll/ܿ۫֡;

    .line 46
    invoke-virtual {v0}, Ll/ܿ۫֡;->ܳ()Ll/ܺ۫֡;

    move-result-object v0

    .line 80
    iget v0, v0, Ll/ܺ۫֡;->֫:I

    return v0
.end method

.method public final ۧ()Ljava/util/List;
    .locals 1

    .line 94
    iget-object v0, p0, Ll/ܽ۫֡;->ۧ:Ll/ܰ۬֡;

    invoke-static {v0}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ()I
    .locals 2

    .line 88
    iget-object v0, p0, Ll/ܽ۫֡;->֫:Ll/ܿ۫֡;

    .line 46
    invoke-virtual {v0}, Ll/ܿ۫֡;->ܳ()Ll/ܺ۫֡;

    move-result-object v0

    .line 80
    iget v0, v0, Ll/ܺ۫֡;->֫:I

    .line 88
    iget-object v1, p0, Ll/ܽ۫֡;->ܽ:Ll/ܿ۫֡;

    .line 46
    invoke-virtual {v1}, Ll/ܿ۫֡;->ܳ()Ll/ܺ۫֡;

    move-result-object v1

    .line 80
    iget v1, v1, Ll/ܺ۫֡;->֫:I

    sub-int/2addr v0, v1

    return v0
.end method
