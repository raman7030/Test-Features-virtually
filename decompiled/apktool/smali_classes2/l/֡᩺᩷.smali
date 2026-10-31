.class public final Ll/֡᩺᩷;
.super Ljava/lang/Object;
.source "71FI"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final ۗ:Ljava/lang/String;

.field public final ۙ:Z

.field public ۤ:Ll/ۧ۫᩷;

.field public ۫:I

.field public ۬:I

.field public ᩶:I

.field public ᩸:I

.field public ᩹:Ll/ۧ۫᩷;


# direct methods
.method public constructor <init>(Ljava/lang/String;Z)V
    .locals 1

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 80
    iput v0, p0, Ll/֡᩺᩷;->۬:I

    .line 81
    iput v0, p0, Ll/֡᩺᩷;->۫:I

    .line 34
    iput-object p1, p0, Ll/֡᩺᩷;->ۗ:Ljava/lang/String;

    .line 35
    iput-boolean p2, p0, Ll/֡᩺᩷;->ۙ:Z

    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 10
    check-cast p1, Ll/֡᩺᩷;

    .line 77
    iget-object v0, p0, Ll/֡᩺᩷;->ۗ:Ljava/lang/String;

    iget-object p1, p1, Ll/֡᩺᩷;->ۗ:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-eqz p1, :cond_2

    .line 63
    const-class v0, Ll/֡᩺᩷;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_1

    goto :goto_0

    .line 65
    :cond_1
    check-cast p1, Ll/֡᩺᩷;

    .line 67
    iget-object v0, p0, Ll/֡᩺᩷;->ۗ:Ljava/lang/String;

    iget-object p1, p1, Ll/֡᩺᩷;->ۗ:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 72
    iget-object v0, p0, Ll/֡᩺᩷;->ۗ:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public final ֫()Ljava/lang/String;
    .locals 3

    .line 39
    new-instance v0, Ll/ۨۜܽ;

    iget-object v1, p0, Ll/֡᩺᩷;->᩹:Ll/ۧ۫᩷;

    invoke-static {v1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1}, Ll/ۧ۫᩷;->᩻()Ll/ܶ᩵ܿ;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/ۨۜܽ;-><init>(Ll/ܶ᩵ܿ;)V

    .line 40
    :try_start_0
    iget v1, p0, Ll/֡᩺᩷;->᩶:I

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Ll/ۨۜܽ;->seek(J)V

    .line 41
    iget-boolean v1, p0, Ll/֡᩺᩷;->ۙ:Z

    if-eqz v1, :cond_0

    .line 42
    invoke-virtual {v0}, Ll/ۨۜܽ;->ۜۧ()[B

    move-result-object v1

    invoke-static {v1}, Ll/ۘۤۡ;->֫([B)Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    invoke-virtual {v0}, Ll/ۨۜܽ;->close()V

    return-object v1

    .line 44
    :cond_0
    :try_start_1
    invoke-virtual {v0}, Ll/ۨۜܽ;->ܽ()Ljava/lang/String;

    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 46
    invoke-virtual {v0}, Ll/ۨۜܽ;->close()V

    return-object v1

    :catchall_0
    move-exception v1

    .line 39
    :try_start_2
    invoke-virtual {v0}, Ll/ۨۜܽ;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v1
.end method
