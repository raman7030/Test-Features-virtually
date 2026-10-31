.class public final Ll/ۨᩳܿ;
.super Ll/ۧܿܿ;
.source "J7R3"


# static fields
.field public static final ۘ:Ll/ۤᩳܿ;


# instance fields
.field public ۖ:Z

.field public ۜ:Ljava/lang/String;

.field public ۡ:I

.field public ۢ:Ljava/lang/String;

.field public final ܳ:Lbin/mt/json/JSONObject;

.field public ܺ:Z

.field public ᩷:Ll/ۤۤ;

.field public ᩻:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 234
    new-instance v0, Ll/ۤᩳܿ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/ۨᩳܿ;->ۘ:Ll/ۤᩳܿ;

    return-void
.end method

.method public constructor <init>(Lbin/mt/json/JSONObject;Ll/ۤۤ;)V
    .locals 8

    const-string v0, "\u26a1 ["

    const/16 v1, 0x22

    .line 60
    invoke-direct {p0, v1}, Ll/ۧܿܿ;-><init>(I)V

    .line 61
    iput-object p1, p0, Ll/ۨᩳܿ;->ܳ:Lbin/mt/json/JSONObject;

    .line 64
    iput-object p2, p0, Ll/ۨᩳܿ;->᩷:Ll/ۤۤ;

    const-string p1, "\u274c "

    const/4 v1, 0x0

    if-nez p2, :cond_0

    .line 67
    :try_start_0
    invoke-direct {p0}, Ll/ۨᩳܿ;->ۢ()Ll/ۤۤ;

    move-result-object p2

    .line 69
    :cond_0
    iget-object v2, p2, Ll/ۤۤ;->֫:Ljava/lang/Object;

    check-cast v2, Ll/ܽܳ᩷;

    .line 70
    iget-object p2, p2, Ll/ۤۤ;->ۧ:Ljava/lang/Object;

    check-cast p2, Lbin/mt/plugin/api/editor/TextEditorFunction;

    .line 71
    invoke-interface {p2}, Lbin/mt/plugin/api/editor/TextEditorFunction;->supportEditTextView()Z

    move-result v3
    :try_end_0
    .catch Ll/ܳۨۡ; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 72
    :try_start_1
    invoke-interface {p2}, Lbin/mt/plugin/api/editor/TextEditorFunction;->supportRepeat()Z

    move-result v4
    :try_end_1
    .catch Ll/ܳۨۡ; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 73
    :try_start_2
    invoke-virtual {v2}, Ll/ܽܳ᩷;->ۧ()Lbin/mt/plugin/api/PluginContext;

    move-result-object v5

    invoke-interface {p2}, Lbin/mt/plugin/api/editor/TextEditorFunction;->name()Ljava/lang/String;

    move-result-object p2

    .line 182
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v6

    const/4 v7, 0x3

    if-lt v6, v7, :cond_1

    invoke-virtual {p2, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v6, 0x7b

    if-ne v1, v6, :cond_1

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {p2, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v6, 0x7d

    if-ne v1, v6, :cond_1

    .line 183
    check-cast v5, Ll/ۤ᩻᩷;

    invoke-virtual {v5, p2}, Ll/ۤ᩻᩷;->getStringNullable(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    move-object p2, v1

    .line 73
    :cond_1
    iput-object p2, p0, Ll/ۨᩳܿ;->ۜ:Ljava/lang/String;

    .line 74
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ll/ܽܳ᩷;->ۡ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "] "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Ll/ۨᩳܿ;->ۜ:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Ll/ۨᩳܿ;->᩻:Ljava/lang/String;
    :try_end_2
    .catch Ll/ܳۨۡ; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_4

    :catchall_0
    move-exception p2

    goto :goto_1

    :catch_0
    move-exception p2

    goto :goto_3

    :catchall_1
    move-exception p2

    move v1, v3

    goto :goto_0

    :catch_1
    move-exception p2

    move v1, v3

    goto :goto_2

    :catchall_2
    move-exception p2

    :goto_0
    const/4 v4, 0x0

    move v3, v1

    .line 79
    :goto_1
    invoke-virtual {p2}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Ll/ۨᩳܿ;->ۜ:Ljava/lang/String;

    .line 80
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p1, p0, Ll/ۨᩳܿ;->ۜ:Ljava/lang/String;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ۨᩳܿ;->᩻:Ljava/lang/String;

    goto :goto_4

    :catch_2
    move-exception p2

    :goto_2
    const/4 v4, 0x0

    move v3, v1

    .line 76
    :goto_3
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Ll/ۨᩳܿ;->ۜ:Ljava/lang/String;

    .line 77
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p1, p0, Ll/ۨᩳܿ;->ۜ:Ljava/lang/String;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ۨᩳܿ;->᩻:Ljava/lang/String;

    .line 82
    :goto_4
    invoke-static {}, Ll/ܶܳ᩷;->ᩳ()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ۨᩳܿ;->ۢ:Ljava/lang/String;

    .line 83
    invoke-static {}, Ll/۬ܿ᩷;->ܽ()I

    move-result p1

    iput p1, p0, Ll/ۨᩳܿ;->ۡ:I

    .line 84
    iput-boolean v3, p0, Ll/ۨᩳܿ;->ܺ:Z

    .line 85
    iput-boolean v4, p0, Ll/ۨᩳܿ;->ۖ:Z

    return-void
.end method

.method private declared-synchronized ۢ()Ll/ۤۤ;
    .locals 10

    const-string v1, "["

    const-string v2, "["

    move-object v0, p0

    .line 5
    monitor-enter v0

    .line 149
    :try_start_0
    iget-object v3, p0, Ll/ۨᩳܿ;->ܳ:Lbin/mt/json/JSONObject;

    const-string v4, "a"

    invoke-virtual {v3, v4}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 150
    iget-object v4, p0, Ll/ۨᩳܿ;->ܳ:Lbin/mt/json/JSONObject;

    const-string v5, "b"

    invoke-virtual {v4, v5}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 151
    invoke-static {v3}, Ll/۬ܿ᩷;->ܽ(Ljava/lang/String;)Ll/ܽܳ᩷;

    move-result-object v5

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v5, :cond_7

    .line 155
    invoke-virtual {v5}, Ll/ܽܳ᩷;->۠()Z

    move-result v3

    if-eqz v3, :cond_6

    .line 158
    invoke-virtual {v5}, Ll/ܽܳ᩷;->᩶()Z

    move-result v3

    const v8, 0x7f12076d

    if-eqz v3, :cond_5

    .line 161
    iget-object v3, p0, Ll/ۨᩳܿ;->᩷:Ll/ۤۤ;

    if-eqz v3, :cond_0

    iget-object v9, v3, Ll/ۤۤ;->֫:Ljava/lang/Object;

    if-ne v9, v5, :cond_0

    iget-object v3, v3, Ll/ۤۤ;->ۧ:Ljava/lang/Object;

    check-cast v3, Lbin/mt/plugin/api/editor/TextEditorFunction;

    invoke-interface {v3}, Lbin/mt/plugin/api/editor/TextEditorFunction;->getContext()Lbin/mt/plugin/api/PluginContext;

    move-result-object v3

    invoke-virtual {v5}, Ll/ܽܳ᩷;->ۧ()Lbin/mt/plugin/api/PluginContext;

    move-result-object v9

    if-ne v3, v9, :cond_0

    .line 162
    iget-object v1, p0, Ll/ۨᩳܿ;->᩷:Ll/ۤۤ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    .line 164
    :cond_0
    :try_start_1
    invoke-virtual {v5, v4}, Ll/ܽܳ᩷;->ۧ(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v3, :cond_4

    .line 170
    :try_start_2
    invoke-virtual {v3}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lbin/mt/plugin/api/editor/TextEditorFunction;

    .line 171
    invoke-virtual {v5}, Ll/ܽܳ᩷;->ۧ()Lbin/mt/plugin/api/PluginContext;

    move-result-object v3

    invoke-interface {v2, v3}, Lbin/mt/plugin/api/editor/TextEditorFunction;->init(Lbin/mt/plugin/api/PluginContext;)V

    .line 172
    invoke-interface {v2}, Lbin/mt/plugin/api/editor/TextEditorFunction;->isEnabled()Z

    move-result v3

    if-nez v3, :cond_2

    .line 173
    invoke-virtual {v5}, Ll/ܽܳ᩷;->ۧ()Lbin/mt/plugin/api/PluginContext;

    move-result-object v3

    invoke-interface {v2}, Lbin/mt/plugin/api/editor/TextEditorFunction;->name()Ljava/lang/String;

    move-result-object v2

    .line 182
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    const/4 v9, 0x3

    if-lt v4, v9, :cond_1

    invoke-virtual {v2, v7}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v9, 0x7b

    if-ne v4, v9, :cond_1

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    sub-int/2addr v4, v6

    invoke-virtual {v2, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v9, 0x7d

    if-ne v4, v9, :cond_1

    .line 183
    check-cast v3, Ll/ۤ᩻᩷;

    invoke-virtual {v3, v2}, Ll/ۤ᩻᩷;->getStringNullable(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_1

    move-object v2, v3

    .line 174
    :cond_1
    new-instance v3, Ll/ܳۨۡ;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 175
    invoke-virtual {v5}, Ll/ܽܳ᩷;->ۡ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "] "

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-array v2, v6, [Ljava/lang/Object;

    aput-object v1, v2, v7

    const v1, 0x7f120768

    .line 174
    invoke-static {v1, v2}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 16
    invoke-direct {v3, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 174
    throw v3

    .line 84
    :cond_2
    new-instance v1, Ll/ۤۤ;

    invoke-direct {v1, v5, v2}, Ll/ۤۤ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 177
    iput-object v1, p0, Ll/ۨᩳܿ;->᩷:Ll/ۤۤ;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v0

    return-object v1

    :catch_0
    move-exception v1

    .line 179
    :try_start_3
    instance-of v2, v1, Ll/ܳۨۡ;

    if-eqz v2, :cond_3

    check-cast v1, Ll/ܳۨۡ;

    .line 180
    throw v1

    .line 182
    :cond_3
    invoke-virtual {v5, v1}, Ll/ܽܳ᩷;->֫(Ljava/lang/Throwable;)V

    .line 183
    new-instance v1, Ll/ܳۨۡ;

    invoke-virtual {v5}, Ll/ܽܳ᩷;->ۡ()Ljava/lang/String;

    move-result-object v2

    new-array v3, v6, [Ljava/lang/Object;

    aput-object v2, v3, v7

    invoke-static {v8, v3}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 16
    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 183
    throw v1

    .line 166
    :cond_4
    new-instance v1, Ll/ܳۨۡ;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 167
    invoke-virtual {v5}, Ll/ܽܳ᩷;->ۡ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "] "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v3, v6, [Ljava/lang/Object;

    aput-object v2, v3, v7

    const v2, 0x7f120769

    .line 166
    invoke-static {v2, v3}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 16
    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 166
    throw v1

    .line 159
    :cond_5
    new-instance v1, Ll/ܳۨۡ;

    invoke-virtual {v5}, Ll/ܽܳ᩷;->ۡ()Ljava/lang/String;

    move-result-object v2

    new-array v3, v6, [Ljava/lang/Object;

    aput-object v2, v3, v7

    invoke-static {v8, v3}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 16
    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 159
    throw v1

    .line 156
    :cond_6
    new-instance v1, Ll/ܳۨۡ;

    invoke-virtual {v5}, Ll/ܽܳ᩷;->ۡ()Ljava/lang/String;

    move-result-object v2

    new-array v3, v6, [Ljava/lang/Object;

    aput-object v2, v3, v7

    const v2, 0x7f120776

    invoke-static {v2, v3}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 16
    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 156
    throw v1

    .line 153
    :cond_7
    new-instance v1, Ll/ܳۨۡ;

    new-array v2, v6, [Ljava/lang/Object;

    aput-object v3, v2, v7

    const v3, 0x7f120778

    invoke-static {v3, v2}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 16
    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 153
    throw v1

    :catchall_0
    move-exception v1

    .line 183
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v1
.end method

.method private ᩷()V
    .locals 8

    const-string v0, "\u26a1 ["

    .line 100
    invoke-static {}, Ll/ܶܳ᩷;->ᩳ()Ljava/lang/String;

    move-result-object v1

    .line 101
    invoke-static {}, Ll/۬ܿ᩷;->ܽ()I

    move-result v2

    .line 102
    iget-object v3, p0, Ll/ۨᩳܿ;->ۢ:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    iget v3, p0, Ll/ۨᩳܿ;->ۡ:I

    if-ne v2, v3, :cond_0

    return-void

    :cond_0
    const/4 v3, 0x0

    .line 107
    :try_start_0
    invoke-direct {p0}, Ll/ۨᩳܿ;->ۢ()Ll/ۤۤ;

    move-result-object v4

    .line 108
    iget-object v5, v4, Ll/ۤۤ;->֫:Ljava/lang/Object;

    check-cast v5, Ll/ܽܳ᩷;
    :try_end_0
    .catch Ll/ܳۨۡ; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 109
    :try_start_1
    iget-object v3, v4, Ll/ۤۤ;->ۧ:Ljava/lang/Object;

    check-cast v3, Lbin/mt/plugin/api/editor/TextEditorFunction;

    .line 110
    invoke-interface {v3}, Lbin/mt/plugin/api/editor/TextEditorFunction;->supportEditTextView()Z

    move-result v4

    iput-boolean v4, p0, Ll/ۨᩳܿ;->ܺ:Z

    .line 111
    invoke-interface {v3}, Lbin/mt/plugin/api/editor/TextEditorFunction;->supportRepeat()Z

    move-result v4

    iput-boolean v4, p0, Ll/ۨᩳܿ;->ۖ:Z

    .line 112
    invoke-virtual {v5}, Ll/ܽܳ᩷;->ۧ()Lbin/mt/plugin/api/PluginContext;

    move-result-object v4

    invoke-interface {v3}, Lbin/mt/plugin/api/editor/TextEditorFunction;->name()Ljava/lang/String;

    move-result-object v3

    .line 182
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v6

    const/4 v7, 0x3

    if-lt v6, v7, :cond_1

    const/4 v6, 0x0

    invoke-virtual {v3, v6}, Ljava/lang/String;->charAt(I)C

    move-result v6

    const/16 v7, 0x7b

    if-ne v6, v7, :cond_1

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v6

    add-int/lit8 v6, v6, -0x1

    invoke-virtual {v3, v6}, Ljava/lang/String;->charAt(I)C

    move-result v6

    const/16 v7, 0x7d

    if-ne v6, v7, :cond_1

    .line 183
    check-cast v4, Ll/ۤ᩻᩷;

    invoke-virtual {v4, v3}, Ll/ۤ᩻᩷;->getStringNullable(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_1

    move-object v3, v4

    .line 112
    :cond_1
    iput-object v3, p0, Ll/ۨᩳܿ;->ۜ:Ljava/lang/String;

    .line 113
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5}, Ll/ܽܳ᩷;->ۡ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "] "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Ll/ۨᩳܿ;->ۜ:Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۨᩳܿ;->᩻:Ljava/lang/String;
    :try_end_1
    .catch Ll/ܳۨۡ; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object v3, v5

    goto :goto_0

    :catchall_1
    move-exception v0

    .line 117
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object v4

    iput-object v4, p0, Ll/ۨᩳܿ;->᩻:Ljava/lang/String;

    iput-object v4, p0, Ll/ۨᩳܿ;->ۜ:Ljava/lang/String;

    if-eqz v3, :cond_2

    .line 119
    invoke-virtual {v3, v0}, Ll/ܽܳ᩷;->֫(Ljava/lang/Throwable;)V

    goto :goto_1

    :catch_0
    move-exception v0

    .line 115
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۨᩳܿ;->᩻:Ljava/lang/String;

    iput-object v0, p0, Ll/ۨᩳܿ;->ۜ:Ljava/lang/String;

    .line 122
    :cond_2
    :goto_1
    iput-object v1, p0, Ll/ۨᩳܿ;->ۢ:Ljava/lang/String;

    .line 123
    iput v2, p0, Ll/ۨᩳܿ;->ۡ:I

    return-void
.end method


# virtual methods
.method public final ֫(Landroid/view/View;Ll/֫ܿܿ;)V
    .locals 6

    .line 189
    invoke-interface {p2}, Ll/֫ܿܿ;->֫()Ll/۫ۨᩳ;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 190
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Ll/ۚ۫ۡ;->֫(Landroid/content/Context;)Landroid/app/Activity;

    move-result-object p1

    check-cast p1, Ll/ۗܺ᩷;

    if-nez p1, :cond_1

    const-string p1, "Cannot get the activity"

    .line 192
    invoke-static {p1}, Ll/᩸ۚۢ;->ۧ(Ljava/lang/CharSequence;)V

    return-void

    :cond_1
    const/4 v0, 0x0

    .line 197
    :try_start_0
    invoke-direct {p0}, Ll/ۨᩳܿ;->ۢ()Ll/ۤۤ;

    move-result-object v1

    .line 198
    iget-object v2, v1, Ll/ۤۤ;->֫:Ljava/lang/Object;

    check-cast v2, Ll/ܽܳ᩷;
    :try_end_0
    .catch Ll/ܳۨۡ; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 199
    :try_start_1
    new-instance v3, Ll/ᩳۢ᩷;

    invoke-virtual {v2}, Ll/ܽܳ᩷;->ۧ()Lbin/mt/plugin/api/PluginContext;

    move-result-object v4

    invoke-direct {v3, v4, p1}, Ll/ᩳۢ᩷;-><init>(Lbin/mt/plugin/api/PluginContext;Ll/ۗܺ᩷;)V

    .line 200
    new-instance v4, Ll/ܿ۫ᩳ;

    invoke-interface {p2}, Ll/֫ܿܿ;->֫()Ll/۫ۨᩳ;

    move-result-object p2

    invoke-direct {v4, p2}, Ll/ܿ۫ᩳ;-><init>(Ll/۫ۨᩳ;)V

    .line 201
    iget-object p2, v1, Ll/ۤۤ;->ۧ:Ljava/lang/Object;

    check-cast p2, Lbin/mt/plugin/api/editor/TextEditorFunction;

    iget-object v1, p0, Ll/ۨᩳܿ;->ܳ:Lbin/mt/json/JSONObject;

    const-string v5, "c"

    invoke-virtual {v1, v5}, Lbin/mt/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    invoke-interface {p2, v3, v4, v1}, Lbin/mt/plugin/api/editor/TextEditorFunction;->doFunction(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/editor/TextEditor;Lbin/mt/json/JSONObject;)V
    :try_end_1
    .catch Ll/ܳۨۡ; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-void

    :catchall_0
    move-exception p2

    goto :goto_0

    :catchall_1
    move-exception p2

    move-object v2, v0

    .line 546
    :goto_0
    invoke-virtual {p1, p2, v0}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    if-eqz v2, :cond_2

    .line 207
    invoke-virtual {v2, p2}, Ll/ܽܳ᩷;->֫(Ljava/lang/Throwable;)V

    goto :goto_1

    :catch_0
    move-exception p1

    .line 203
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/᩸ۚۢ;->֫(Ljava/lang/CharSequence;)Ll/᩸ۚۢ;

    :cond_2
    :goto_1
    return-void
.end method

.method public final ֫(Landroid/view/View;Ll/ۤۤᩳ;)V
    .locals 4

    .line 214
    iget-boolean v0, p0, Ll/ۨᩳܿ;->ܺ:Z

    if-eqz v0, :cond_1

    .line 217
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Ll/ۚ۫ۡ;->֫(Landroid/content/Context;)Landroid/app/Activity;

    move-result-object p1

    check-cast p1, Ll/ۗܺ᩷;

    if-nez p1, :cond_0

    const-string p1, "Cannot get the activity"

    .line 219
    invoke-static {p1}, Ll/᩸ۚۢ;->ۧ(Ljava/lang/CharSequence;)V

    return-void

    .line 223
    :cond_0
    :try_start_0
    invoke-direct {p0}, Ll/ۨᩳܿ;->ۢ()Ll/ۤۤ;

    move-result-object v0

    .line 224
    new-instance v1, Ll/ᩳۢ᩷;

    iget-object v2, v0, Ll/ۤۤ;->֫:Ljava/lang/Object;

    check-cast v2, Ll/ܽܳ᩷;

    invoke-virtual {v2}, Ll/ܽܳ᩷;->ۧ()Lbin/mt/plugin/api/PluginContext;

    move-result-object v2

    invoke-direct {v1, v2, p1}, Ll/ᩳۢ᩷;-><init>(Lbin/mt/plugin/api/PluginContext;Ll/ۗܺ᩷;)V

    .line 225
    new-instance v2, Ll/ܿ۫ᩳ;

    invoke-direct {v2, p2}, Ll/ܿ۫ᩳ;-><init>(Ll/۫ۨᩳ;)V

    .line 226
    iget-object p2, v0, Ll/ۤۤ;->ۧ:Ljava/lang/Object;

    check-cast p2, Lbin/mt/plugin/api/editor/TextEditorFunction;

    iget-object v0, p0, Ll/ۨᩳܿ;->ܳ:Lbin/mt/json/JSONObject;

    const-string v3, "c"

    invoke-virtual {v0, v3}, Lbin/mt/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    invoke-interface {p2, v1, v2, v0}, Lbin/mt/plugin/api/editor/TextEditorFunction;->doFunction(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/editor/TextEditor;Lbin/mt/json/JSONObject;)V
    :try_end_0
    .catch Ll/ܳۨۡ; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p2

    const/4 v0, 0x0

    .line 546
    invoke-virtual {p1, p2, v0}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    goto :goto_0

    :catch_0
    move-exception p1

    .line 228
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/᩸ۚۢ;->֫(Ljava/lang/CharSequence;)Ll/᩸ۚۢ;

    :goto_0
    return-void

    .line 215
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public final ۜ()Ljava/lang/String;
    .locals 1

    .line 95
    invoke-direct {p0}, Ll/ۨᩳܿ;->᩷()V

    .line 96
    iget-object v0, p0, Ll/ۨᩳܿ;->᩻:Ljava/lang/String;

    return-object v0
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    .line 90
    invoke-direct {p0}, Ll/ۨᩳܿ;->᩷()V

    .line 91
    iget-object v0, p0, Ll/ۨᩳܿ;->ۜ:Ljava/lang/String;

    return-object v0
.end method

.method public final ܳ()Z
    .locals 2

    .line 133
    iget v0, p0, Ll/ۨᩳܿ;->ۡ:I

    invoke-static {}, Ll/۬ܿ᩷;->ܽ()I

    move-result v1

    if-eq v0, v1, :cond_0

    .line 134
    invoke-direct {p0}, Ll/ۨᩳܿ;->᩷()V

    .line 136
    :cond_0
    iget-boolean v0, p0, Ll/ۨᩳܿ;->ܺ:Z

    return v0
.end method

.method public final ᩳ()Lbin/mt/json/JSONObject;
    .locals 1

    .line 128
    iget-object v0, p0, Ll/ۨᩳܿ;->ܳ:Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ᩻()Z
    .locals 2

    .line 141
    iget v0, p0, Ll/ۨᩳܿ;->ۡ:I

    invoke-static {}, Ll/۬ܿ᩷;->ܽ()I

    move-result v1

    if-eq v0, v1, :cond_0

    .line 142
    invoke-direct {p0}, Ll/ۨᩳܿ;->᩷()V

    .line 144
    :cond_0
    iget-boolean v0, p0, Ll/ۨᩳܿ;->ۖ:Z

    return v0
.end method
