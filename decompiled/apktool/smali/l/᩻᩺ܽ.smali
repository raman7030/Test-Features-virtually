.class public final Ll/᩻᩺ܽ;
.super Ljava/lang/Object;
.source "492R"


# instance fields
.field public ֫:Ll/ᩳܰܽ;

.field public ۧ:Z

.field public ܳ:Ll/ᩳܰܽ;

.field public ܽ:Z

.field public ܿ:Z

.field public ᩳ:Z

.field public ᩻:Ll/ᩳܰܽ;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    new-instance v0, Ll/ᩳܰܽ;

    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 9
    iput-object v0, p0, Ll/᩻᩺ܽ;->֫:Ll/ᩳܰܽ;

    .line 10
    new-instance v0, Ll/ᩳܰܽ;

    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 10
    iput-object v0, p0, Ll/᩻᩺ܽ;->ܳ:Ll/ᩳܰܽ;

    .line 11
    new-instance v0, Ll/ᩳܰܽ;

    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object v0, p0, Ll/᩻᩺ܽ;->᩻:Ll/ᩳܰܽ;

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 2

    .line 116
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/᩻᩺ܽ;->֫:Ll/ᩳܰܽ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "->"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/᩻᩺ܽ;->ܳ:Ll/ᩳܰܽ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/᩻᩺ܽ;->᩻:Ll/ᩳܰܽ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/᩻᩺ܽ;)V
    .locals 2

    .line 18
    iget-object v0, p0, Ll/᩻᩺ܽ;->֫:Ll/ᩳܰܽ;

    iget-object v1, p1, Ll/᩻᩺ܽ;->֫:Ll/ᩳܰܽ;

    invoke-virtual {v0, v1}, Ll/ᩳܰܽ;->֫(Ll/ᩳܰܽ;)V

    .line 19
    iget-object v0, p0, Ll/᩻᩺ܽ;->ܳ:Ll/ᩳܰܽ;

    iget-object v1, p1, Ll/᩻᩺ܽ;->ܳ:Ll/ᩳܰܽ;

    invoke-virtual {v0, v1}, Ll/ᩳܰܽ;->֫(Ll/ᩳܰܽ;)V

    .line 20
    iget-object v0, p0, Ll/᩻᩺ܽ;->᩻:Ll/ᩳܰܽ;

    iget-object v1, p1, Ll/᩻᩺ܽ;->᩻:Ll/ᩳܰܽ;

    invoke-virtual {v0, v1}, Ll/ᩳܰܽ;->֫(Ll/ᩳܰܽ;)V

    .line 21
    iget-boolean v0, p1, Ll/᩻᩺ܽ;->ۧ:Z

    iput-boolean v0, p0, Ll/᩻᩺ܽ;->ۧ:Z

    .line 22
    iget-boolean v0, p1, Ll/᩻᩺ܽ;->ᩳ:Z

    iput-boolean v0, p0, Ll/᩻᩺ܽ;->ᩳ:Z

    .line 23
    iget-boolean v0, p1, Ll/᩻᩺ܽ;->ܽ:Z

    iput-boolean v0, p0, Ll/᩻᩺ܽ;->ܽ:Z

    .line 24
    iget-boolean p1, p1, Ll/᩻᩺ܽ;->ܿ:Z

    iput-boolean p1, p0, Ll/᩻᩺ܽ;->ܿ:Z

    return-void
.end method

.method public final ۧ()Lorg/json/JSONObject;
    .locals 3

    .line 131
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 132
    iget-object v1, p0, Ll/᩻᩺ܽ;->֫:Ll/ᩳܰܽ;

    const/16 v2, 0x61

    invoke-virtual {v1, v0, v2}, Ll/ᩳܰܽ;->ۧ(Lorg/json/JSONObject;C)V

    .line 133
    iget-object v1, p0, Ll/᩻᩺ܽ;->᩻:Ll/ᩳܰܽ;

    const/16 v2, 0x64

    invoke-virtual {v1, v0, v2}, Ll/ᩳܰܽ;->ۧ(Lorg/json/JSONObject;C)V

    .line 134
    iget-object v1, p0, Ll/᩻᩺ܽ;->ܳ:Ll/ᩳܰܽ;

    const/16 v2, 0x67

    invoke-virtual {v1, v0, v2}, Ll/ᩳܰܽ;->ۧ(Lorg/json/JSONObject;C)V

    const-string v1, "j"

    .line 135
    iget-boolean v2, p0, Ll/᩻᩺ܽ;->ۧ:Z

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v1, "k"

    .line 136
    iget-boolean v2, p0, Ll/᩻᩺ܽ;->ᩳ:Z

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v1, "l"

    .line 137
    iget-boolean v2, p0, Ll/᩻᩺ܽ;->ܽ:Z

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v1, "m"

    .line 138
    iget-boolean v2, p0, Ll/᩻᩺ܽ;->ܿ:Z

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 141
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method
