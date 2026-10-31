.class public final Ll/ܺ۫֡;
.super Ljava/lang/Object;
.source "O55N"


# instance fields
.field public ֫:I

.field public final ۧ:Ll/ܳ۫֡;

.field public ܳ:[Z

.field public ܽ:I

.field public final ܿ:Ll/ۢ۫֡;

.field public ᩳ:Ll/۟۬֡;


# direct methods
.method public constructor <init>(Ll/۟۬֡;II)V
    .locals 1

    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 67
    new-instance v0, Ll/ܳ۫֡;

    .line 3
    invoke-direct {v0}, Ll/᩷۫֡;-><init>()V

    .line 67
    iput-object v0, p0, Ll/ܺ۫֡;->ۧ:Ll/ܳ۫֡;

    .line 68
    new-instance v0, Ll/ۢ۫֡;

    .line 3
    invoke-direct {v0}, Ll/᩷۫֡;-><init>()V

    .line 68
    iput-object v0, p0, Ll/ܺ۫֡;->ܿ:Ll/ۢ۫֡;

    .line 69
    iput-object p1, p0, Ll/ܺ۫֡;->ᩳ:Ll/۟۬֡;

    .line 70
    iput p2, p0, Ll/ܺ۫֡;->֫:I

    .line 71
    iput p3, p0, Ll/ܺ۫֡;->ܽ:I

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 80
    iget v0, p0, Ll/ܺ۫֡;->֫:I

    return v0
.end method

.method public final ֫(Ll/ܺ۫֡;)V
    .locals 2

    .line 88
    iget-object v0, p0, Ll/ܺ۫֡;->ܿ:Ll/ۢ۫֡;

    iget-object v1, p1, Ll/ܺ۫֡;->ܿ:Ll/ۢ۫֡;

    invoke-virtual {v0, v1, p1}, Ll/᩷۫֡;->֫(Ll/᩷۫֡;Ll/ܺ۫֡;)V

    .line 89
    iget-object v0, p0, Ll/ܺ۫֡;->ۧ:Ll/ܳ۫֡;

    iget-object v1, p1, Ll/ܺ۫֡;->ۧ:Ll/ܳ۫֡;

    invoke-virtual {v0, v1, p1}, Ll/᩷۫֡;->֫(Ll/᩷۫֡;Ll/ܺ۫֡;)V

    return-void
.end method

.method public final ֫([Z)V
    .locals 0

    .line 163
    iput-object p1, p0, Ll/ܺ۫֡;->ܳ:[Z

    return-void
.end method

.method public final ۧ()Ljava/util/Set;
    .locals 2

    .line 30
    new-instance v0, Ll/ۜ۫֡;

    iget-object v1, p0, Ll/ܺ۫֡;->ۧ:Ll/ܳ۫֡;

    invoke-direct {v0, v1, p0}, Ll/ۜ۫֡;-><init>(Ll/᩷۫֡;Ll/ܺ۫֡;)V

    return-object v0
.end method

.method public final ܳ()[Z
    .locals 1

    .line 144
    iget-object v0, p0, Ll/ܺ۫֡;->ܳ:[Z

    return-object v0
.end method

.method public final ܽ()I
    .locals 1

    .line 84
    iget v0, p0, Ll/ܺ۫֡;->ܽ:I

    return v0
.end method

.method public final ܿ()Ljava/util/Set;
    .locals 2

    .line 30
    new-instance v0, Ll/ۜ۫֡;

    iget-object v1, p0, Ll/ܺ۫֡;->ܿ:Ll/ۢ۫֡;

    invoke-direct {v0, v1, p0}, Ll/ۜ۫֡;-><init>(Ll/᩷۫֡;Ll/ܺ۫֡;)V

    return-object v0
.end method

.method public final ᩳ()Ll/۟۬֡;
    .locals 1

    .line 76
    iget-object v0, p0, Ll/ܺ۫֡;->ᩳ:Ll/۟۬֡;

    return-object v0
.end method
