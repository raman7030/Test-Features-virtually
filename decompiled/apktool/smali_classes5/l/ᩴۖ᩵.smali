.class public final Ll/ᩴۖ᩵;
.super Ljava/lang/Object;
.source "I9YM"

# interfaces
.implements Ll/۠ۡ᩵;


# instance fields
.field public ۙ:Ll/ۚۚ᩵;

.field public ᩶:I

.field public ᩸:I

.field public ᩹:Z


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 5

    .line 161
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    .line 81
    iget-boolean v1, p0, Ll/ᩴۖ᩵;->᩹:Z

    if-eqz v1, :cond_0

    const-string v1, "Allow "

    goto :goto_0

    :cond_0
    const-string v1, "Deny  "

    .line 162
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 163
    iget-object v1, p0, Ll/ᩴۖ᩵;->ۙ:Ll/ۚۚ᩵;

    invoke-virtual {v1}, Ll/ۚۚ᩵;->֫()Ljava/lang/String;

    move-result-object v1

    .line 145
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 146
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    rsub-int/lit8 v1, v1, 0x19

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_1
    const/16 v4, 0x20

    if-ge v3, v1, :cond_1

    .line 148
    invoke-virtual {v0, v4}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    const-string v1, " 0x"

    .line 164
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget v1, p0, Ll/ᩴۖ᩵;->᩸:I

    const/16 v3, 0x8

    invoke-static {v1, v3}, Ll/۫֨᩵;->֫(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 87
    iget v1, p0, Ll/ᩴۖ᩵;->᩶:I

    and-int/lit8 v1, v1, 0x10

    if-eqz v1, :cond_2

    const-string v1, "Inherited "

    goto :goto_2

    :cond_2
    const-string v1, "Direct    "

    .line 165
    :goto_2
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 99
    iget v1, p0, Ll/ᩴۖ᩵;->᩶:I

    and-int/lit8 v1, v1, 0xb

    if-eqz v1, :cond_6

    const/4 v3, 0x1

    if-eq v1, v3, :cond_5

    const/4 v3, 0x2

    if-eq v1, v3, :cond_4

    const/4 v3, 0x3

    if-eq v1, v3, :cond_3

    packed-switch v1, :pswitch_data_0

    const-string v1, "Invalid"

    goto :goto_3

    :pswitch_0
    const-string v1, "Subfolders and files only"

    goto :goto_3

    :pswitch_1
    const-string v1, "Subfolders only"

    goto :goto_3

    :pswitch_2
    const-string v1, "Files only"

    goto :goto_3

    :cond_3
    const-string v1, "This folder, subfolders and files"

    goto :goto_3

    :cond_4
    const-string v1, "This folder and subfolders"

    goto :goto_3

    :cond_5
    const-string v1, "This folder and files"

    goto :goto_3

    :cond_6
    const-string v1, "This folder only"

    .line 145
    :goto_3
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 146
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    rsub-int/lit8 v1, v1, 0x22

    :goto_4
    if-ge v2, v1, :cond_7

    .line 148
    invoke-virtual {v0, v4}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    .line 167
    :cond_7
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ֫(II[B)I
    .locals 1

    add-int/lit8 p2, p1, 0x1

    .line 133
    aget-byte v0, p3, p1

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Ll/ᩴۖ᩵;->᩹:Z

    add-int/lit8 v0, p1, 0x2

    .line 134
    aget-byte p2, p3, p2

    and-int/lit16 p2, p2, 0xff

    iput p2, p0, Ll/ᩴۖ᩵;->᩶:I

    .line 135
    invoke-static {v0, p3}, Ll/֫֡᩵;->֫(I[B)I

    move-result p2

    add-int/lit8 v0, p1, 0x4

    .line 137
    invoke-static {v0, p3}, Ll/֫֡᩵;->ۧ(I[B)I

    move-result v0

    iput v0, p0, Ll/ᩴۖ᩵;->᩸:I

    add-int/lit8 p1, p1, 0x8

    .line 139
    new-instance v0, Ll/ۚۚ᩵;

    invoke-direct {v0, p3, p1}, Ll/ۚۚ᩵;-><init>([BI)V

    iput-object v0, p0, Ll/ᩴۖ᩵;->ۙ:Ll/ۚۚ᩵;

    return p2
.end method
