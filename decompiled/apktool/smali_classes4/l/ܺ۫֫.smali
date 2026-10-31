.class public final Ll/ܺ۫֫;
.super Ljava/lang/Object;
.source "X8TF"


# static fields
.field public static final ᩳ:Ll/ܺ۫֫;


# instance fields
.field public final ֫:Z

.field public final ۧ:Z

.field public final ܽ:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 27
    new-instance v0, Ll/ۡ۫֫;

    .line 41
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 28
    invoke-virtual {v0}, Ll/ۡ۫֫;->֫()Ll/ܺ۫֫;

    move-result-object v0

    sput-object v0, Ll/ܺ۫֫;->ᩳ:Ll/ܺ۫֫;

    return-void
.end method

.method public constructor <init>(Ll/ۡ۫֫;)V
    .locals 1

    .line 106
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 107
    invoke-static {p1}, Ll/ۡ۫֫;->֫(Ll/ۡ۫֫;)Z

    move-result v0

    iput-boolean v0, p0, Ll/ܺ۫֫;->֫:Z

    .line 108
    invoke-static {p1}, Ll/ۡ۫֫;->ۧ(Ll/ۡ۫֫;)Z

    move-result v0

    iput-boolean v0, p0, Ll/ܺ۫֫;->ۧ:Z

    .line 109
    invoke-static {p1}, Ll/ۡ۫֫;->ܽ(Ll/ۡ۫֫;)Z

    move-result p1

    iput-boolean p1, p0, Ll/ܺ۫֫;->ܽ:Z

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    .line 122
    const-class v2, Ll/ܺ۫֫;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    .line 125
    :cond_1
    check-cast p1, Ll/ܺ۫֫;

    .line 126
    iget-boolean v2, p0, Ll/ܺ۫֫;->֫:Z

    iget-boolean v3, p1, Ll/ܺ۫֫;->֫:Z

    if-ne v2, v3, :cond_2

    iget-boolean v2, p0, Ll/ܺ۫֫;->ۧ:Z

    iget-boolean v3, p1, Ll/ܺ۫֫;->ۧ:Z

    if-ne v2, v3, :cond_2

    iget-boolean v2, p0, Ll/ܺ۫֫;->ܽ:Z

    iget-boolean p1, p1, Ll/ܺ۫֫;->ܽ:Z

    if-ne v2, p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    .line 133
    iget-boolean v0, p0, Ll/ܺ۫֫;->֫:Z

    shl-int/lit8 v0, v0, 0x2

    .line 134
    iget-boolean v1, p0, Ll/ܺ۫֫;->ۧ:Z

    shl-int/lit8 v1, v1, 0x1

    add-int/2addr v0, v1

    .line 135
    iget-boolean v1, p0, Ll/ܺ۫֫;->ܽ:Z

    add-int/2addr v0, v1

    return v0
.end method
