.class public final Ll/֡᩺֫;
.super Ljava/lang/Object;
.source "U7MS"


# instance fields
.field public final ֫:D

.field public final ۧ:Ljava/lang/String;

.field public final ܽ:Ljava/lang/String;

.field public final ᩳ:I


# direct methods
.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1163
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    const-string v1, "0x"

    .line 1164
    invoke-virtual {p3, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "0X"

    invoke-virtual {p3, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :cond_1
    :goto_0
    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    .line 1165
    iput-object p2, p0, Ll/֡᩺֫;->ۧ:Ljava/lang/String;

    .line 1166
    iput p1, p0, Ll/֡᩺֫;->ᩳ:I

    .line 1167
    iput-object p3, p0, Ll/֡᩺֫;->ܽ:Ljava/lang/String;

    const-wide/16 p1, 0x0

    .line 1168
    iput-wide p1, p0, Ll/֡᩺֫;->֫:D

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;D)V
    .locals 0

    .line 1155
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1156
    iput-object p1, p0, Ll/֡᩺֫;->ۧ:Ljava/lang/String;

    const/4 p1, 0x2

    .line 1157
    iput p1, p0, Ll/֡᩺֫;->ᩳ:I

    .line 1158
    iput-wide p2, p0, Ll/֡᩺֫;->֫:D

    const/4 p1, 0x0

    .line 1159
    iput-object p1, p0, Ll/֡᩺֫;->ܽ:Ljava/lang/String;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/֡᩺֫;)D
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/֡᩺֫;->֫:D

    return-wide v0
.end method

.method public static bridge synthetic ۧ(Ll/֡᩺֫;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֡᩺֫;->ܽ:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    if-ne p0, p1, :cond_0

    goto :goto_0

    .line 1197
    :cond_0
    instance-of v0, p1, Ll/֡᩺֫;

    if-nez v0, :cond_1

    goto :goto_1

    .line 1200
    :cond_1
    check-cast p1, Ll/֡᩺֫;

    .line 1201
    iget v0, p0, Ll/֡᩺֫;->ᩳ:I

    iget v1, p1, Ll/֡᩺֫;->ᩳ:I

    if-ne v0, v1, :cond_2

    iget-wide v0, p0, Ll/֡᩺֫;->֫:D

    iget-wide v2, p1, Ll/֡᩺֫;->֫:D

    .line 1202
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Double;->compare(DD)I

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Ll/֡᩺֫;->ۧ:Ljava/lang/String;

    iget-object v1, p1, Ll/֡᩺֫;->ۧ:Ljava/lang/String;

    .line 1203
    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Ll/֡᩺֫;->ܽ:Ljava/lang/String;

    iget-object p1, p1, Ll/֡᩺֫;->ܽ:Ljava/lang/String;

    .line 1204
    invoke-static {v0, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 5

    .line 1209
    iget v0, p0, Ll/֡᩺֫;->ᩳ:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-wide v1, p0, Ll/֡᩺֫;->֫:D

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    const/4 v2, 0x4

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p0, Ll/֡᩺֫;->ۧ:Ljava/lang/String;

    aput-object v4, v2, v3

    const/4 v3, 0x1

    aput-object v0, v2, v3

    const/4 v0, 0x2

    aput-object v1, v2, v0

    const/4 v0, 0x3

    iget-object v1, p0, Ll/֡᩺֫;->ܽ:Ljava/lang/String;

    aput-object v1, v2, v0

    invoke-static {v2}, Ll/ۧ۫ᩴ;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
