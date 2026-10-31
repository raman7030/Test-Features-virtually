.class public final Ll/֫֫֡;
.super Ljava/lang/Object;
.source "A4DP"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public final synthetic ۙ:Ll/ۧ֫֡;

.field public final ᩶:[Ll/֨ᩳ֡;

.field public final ᩸:Ljava/lang/String;

.field public final ᩹:J


# direct methods
.method public constructor <init>(Ll/ۧ֫֡;Ljava/lang/String;J[Ll/֨ᩳ֡;)V
    .locals 0

    .line 795
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֫֫֡;->ۙ:Ll/ۧ֫֡;

    .line 796
    iput-object p2, p0, Ll/֫֫֡;->᩸:Ljava/lang/String;

    .line 797
    iput-wide p3, p0, Ll/֫֫֡;->᩹:J

    .line 798
    iput-object p5, p0, Ll/֫֫֡;->᩶:[Ll/֨ᩳ֡;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 4

    .line 825
    iget-object v0, p0, Ll/֫֫֡;->᩶:[Ll/֨ᩳ֡;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    .line 826
    invoke-static {v3}, Ll/᩶۟᩵;->֫(Ljava/io/Closeable;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ֫(I)Ll/֨ᩳ֡;
    .locals 1

    .line 816
    iget-object v0, p0, Ll/֫֫֡;->᩶:[Ll/֨ᩳ֡;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final ֫()Ll/ܰ۟᩵;
    .locals 4

    .line 811
    iget-object v0, p0, Ll/֫֫֡;->᩸:Ljava/lang/String;

    iget-wide v1, p0, Ll/֫֫֡;->᩹:J

    iget-object v3, p0, Ll/֫֫֡;->ۙ:Ll/ۧ֫֡;

    invoke-virtual {v3, v1, v2, v0}, Ll/ۧ֫֡;->֫(JLjava/lang/String;)Ll/ܰ۟᩵;

    move-result-object v0

    return-object v0
.end method
