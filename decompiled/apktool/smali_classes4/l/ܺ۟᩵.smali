.class public final Ll/ܺ۟᩵;
.super Ll/ۖ۟᩵;
.source "N4FD"


# instance fields
.field public final synthetic ֫:I

.field public final synthetic ۧ:[B

.field public final synthetic ܽ:Ll/ܰܰ᩵;


# direct methods
.method public constructor <init>(Ll/ܰܰ᩵;I[B)V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 88
    iput-object p1, p0, Ll/ܺ۟᩵;->ܽ:Ll/ܰܰ᩵;

    iput p2, p0, Ll/ܺ۟᩵;->֫:I

    iput-object p3, p0, Ll/ܺ۟᩵;->ۧ:[B

    return-void
.end method


# virtual methods
.method public final ֫()J
    .locals 2

    .line 94
    iget v0, p0, Ll/ܺ۟᩵;->֫:I

    int-to-long v0, v0

    return-wide v0
.end method

.method public final ֫(Ll/ۤܽ֡;)V
    .locals 3

    const/4 v0, 0x0

    .line 98
    iget v1, p0, Ll/ܺ۟᩵;->֫:I

    iget-object v2, p0, Ll/ܺ۟᩵;->ۧ:[B

    invoke-interface {p1, v0, v1, v2}, Ll/ۤܽ֡;->ᩳ(II[B)Ll/ۤܽ֡;

    return-void
.end method

.method public final ܽ()Ll/ܰܰ᩵;
    .locals 1

    .line 90
    iget-object v0, p0, Ll/ܺ۟᩵;->ܽ:Ll/ܰܰ᩵;

    return-object v0
.end method
