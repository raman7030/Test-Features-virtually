.class public final Ll/ۨۤ֡;
.super Ljava/lang/Object;
.source "84VE"

# interfaces
.implements Ll/ᩳۧۚ;


# instance fields
.field public final ֫:I

.field public ۧ:Ll/ۧ۫֡;

.field public final ܽ:Ll/ܿ۫֡;


# direct methods
.method public constructor <init>(Ll/ۧ۫֡;ILl/ܿ۫֡;)V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Ll/ۨۤ֡;->ۧ:Ll/ۧ۫֡;

    .line 20
    iput p2, p0, Ll/ۨۤ֡;->֫:I

    .line 21
    iput-object p3, p0, Ll/ۨۤ֡;->ܽ:Ll/ܿ۫֡;

    return-void
.end method


# virtual methods
.method public final getKey()I
    .locals 1

    .line 26
    iget v0, p0, Ll/ۨۤ֡;->֫:I

    return v0
.end method

.method public final ֫()I
    .locals 2

    .line 31
    iget-object v0, p0, Ll/ۨۤ֡;->ܽ:Ll/ܿ۫֡;

    invoke-virtual {v0}, Ll/ܿ۫֡;->ᩳ()I

    move-result v0

    iget-object v1, p0, Ll/ۨۤ֡;->ۧ:Ll/ۧ۫֡;

    invoke-virtual {v1}, Ll/ۧ۫֡;->ۛ()Ll/ܺ۫֡;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܺ۫֡;->֫()I

    move-result v1

    sub-int/2addr v0, v1

    return v0
.end method

.method public final ۧ()Ll/ܿ۫֡;
    .locals 1

    .line 36
    iget-object v0, p0, Ll/ۨۤ֡;->ܽ:Ll/ܿ۫֡;

    return-object v0
.end method
