.class public final Ll/ܺۚ֫;
.super Ljava/lang/Object;
.source "B8O3"


# instance fields
.field public final ֫:Ljava/util/HashMap;

.field public final ۧ:[Ll/ۢۚ֫;

.field public final ܽ:I

.field public final ܿ:[Ll/ۡۚ֫;

.field public final ᩳ:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    .line 77
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 78
    invoke-static {}, Landroid/opengl/GLES20;->glCreateProgram()I

    move-result v0

    iput v0, p0, Ll/ܺۚ֫;->ܽ:I

    .line 79
    invoke-static {}, Ll/ۘۚ֫;->֫()V

    const v1, 0x8b31

    .line 82
    invoke-static {v0, v1, p1}, Ll/ܺۚ֫;->֫(IILjava/lang/String;)V

    const p1, 0x8b30

    .line 83
    invoke-static {v0, p1, p2}, Ll/ܺۚ֫;->֫(IILjava/lang/String;)V

    .line 86
    invoke-static {v0}, Landroid/opengl/GLES20;->glLinkProgram(I)V

    const/4 p1, 0x0

    .line 87
    filled-new-array {p1}, [I

    move-result-object p2

    const v1, 0x8b82

    .line 88
    invoke-static {v0, v1, p2, p1}, Landroid/opengl/GLES20;->glGetProgramiv(II[II)V

    .line 89
    aget p2, p2, p1

    const/4 v1, 0x1

    if-ne p2, v1, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unable to link shader program: \n"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 91
    invoke-static {v0}, Landroid/opengl/GLES20;->glGetProgramInfoLog(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 89
    invoke-static {v2, p2}, Ll/ۘۚ֫;->֫(Ljava/lang/String;Z)V

    .line 92
    invoke-static {v0}, Landroid/opengl/GLES20;->glUseProgram(I)V

    .line 93
    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    iput-object p2, p0, Ll/ܺۚ֫;->֫:Ljava/util/HashMap;

    new-array p2, v1, [I

    const v2, 0x8b89

    .line 95
    invoke-static {v0, v2, p2, p1}, Landroid/opengl/GLES20;->glGetProgramiv(II[II)V

    .line 96
    aget v0, p2, p1

    new-array v0, v0, [Ll/ۢۚ֫;

    iput-object v0, p0, Ll/ܺۚ֫;->ۧ:[Ll/ۢۚ֫;

    const/4 v0, 0x0

    .line 97
    :goto_1
    aget v2, p2, p1

    if-ge v0, v2, :cond_1

    .line 98
    iget v2, p0, Ll/ܺۚ֫;->ܽ:I

    invoke-static {v2, v0}, Ll/ۢۚ֫;->֫(II)Ll/ۢۚ֫;

    move-result-object v2

    .line 99
    iget-object v3, p0, Ll/ܺۚ֫;->ۧ:[Ll/ۢۚ֫;

    aput-object v2, v3, v0

    .line 100
    iget-object v3, p0, Ll/ܺۚ֫;->֫:Ljava/util/HashMap;

    iget-object v4, v2, Ll/ۢۚ֫;->֫:Ljava/lang/String;

    invoke-virtual {v3, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 102
    :cond_1
    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    iput-object p2, p0, Ll/ܺۚ֫;->ᩳ:Ljava/util/HashMap;

    new-array p2, v1, [I

    .line 104
    iget v0, p0, Ll/ܺۚ֫;->ܽ:I

    const v1, 0x8b86

    invoke-static {v0, v1, p2, p1}, Landroid/opengl/GLES20;->glGetProgramiv(II[II)V

    .line 105
    aget v0, p2, p1

    new-array v0, v0, [Ll/ۡۚ֫;

    iput-object v0, p0, Ll/ܺۚ֫;->ܿ:[Ll/ۡۚ֫;

    const/4 v0, 0x0

    .line 106
    :goto_2
    aget v1, p2, p1

    if-ge v0, v1, :cond_2

    .line 107
    iget v1, p0, Ll/ܺۚ֫;->ܽ:I

    invoke-static {v1, v0}, Ll/ۡۚ֫;->֫(II)Ll/ۡۚ֫;

    move-result-object v1

    .line 108
    iget-object v2, p0, Ll/ܺۚ֫;->ܿ:[Ll/ۡۚ֫;

    aput-object v1, v2, v0

    .line 109
    iget-object v2, p0, Ll/ܺۚ֫;->ᩳ:Ljava/util/HashMap;

    iget-object v3, v1, Ll/ۡۚ֫;->֫:Ljava/lang/String;

    invoke-virtual {v2, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 111
    :cond_2
    invoke-static {}, Ll/ۘۚ֫;->֫()V

    return-void
.end method

.method public static ֫(IILjava/lang/String;)V
    .locals 3

    .line 115
    invoke-static {p1}, Landroid/opengl/GLES20;->glCreateShader(I)I

    move-result p1

    .line 116
    invoke-static {p1, p2}, Landroid/opengl/GLES20;->glShaderSource(ILjava/lang/String;)V

    .line 117
    invoke-static {p1}, Landroid/opengl/GLES20;->glCompileShader(I)V

    const/4 v0, 0x0

    .line 119
    filled-new-array {v0}, [I

    move-result-object v1

    const v2, 0x8b81

    .line 120
    invoke-static {p1, v2, v1, v0}, Landroid/opengl/GLES20;->glGetShaderiv(II[II)V

    .line 121
    aget v1, v1, v0

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    const/4 v0, 0x1

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 122
    invoke-static {p1}, Landroid/opengl/GLES20;->glGetShaderInfoLog(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", source: \n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 121
    invoke-static {p2, v0}, Ll/ۘۚ֫;->֫(Ljava/lang/String;Z)V

    .line 124
    invoke-static {p0, p1}, Landroid/opengl/GLES20;->glAttachShader(II)V

    .line 125
    invoke-static {p1}, Landroid/opengl/GLES20;->glDeleteShader(I)V

    .line 126
    invoke-static {}, Ll/ۘۚ֫;->֫()V

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)I
    .locals 1

    .line 135
    iget v0, p0, Ll/ܺۚ֫;->ܽ:I

    .line 130
    invoke-static {v0, p1}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    move-result p1

    .line 169
    invoke-static {p1}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 170
    invoke-static {}, Ll/ۘۚ֫;->֫()V

    return p1
.end method

.method public final ۧ(Ljava/lang/String;)I
    .locals 1

    .line 144
    iget v0, p0, Ll/ܺۚ֫;->ܽ:I

    .line 139
    invoke-static {v0, p1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result p1

    return p1
.end method
