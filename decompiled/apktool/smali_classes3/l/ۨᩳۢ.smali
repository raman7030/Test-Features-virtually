.class public final Ll/ۨᩳۢ;
.super Ljava/lang/Object;
.source "U8G3"


# direct methods
.method public static bridge synthetic ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 0
    invoke-static {p0}, Ll/ۨᩳۢ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ۡۧۢ;)Ljava/lang/String;
    .locals 4

    .line 143
    iget-object v0, p0, Ll/ۡۧۢ;->ۧ:Ljava/lang/String;

    const-string v1, "[a-zA-Z]\\w*"

    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "Class"

    .line 81
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 83
    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, 0xffff

    and-int/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    const-string v0, "cls%X"

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 147
    :goto_0
    iget-object p0, p0, Ll/ۡۧۢ;->ᩳ:Ljava/lang/String;

    .line 72
    invoke-static {p0}, Ll/ۨᩳۢ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-string v1, " = classLoader.loadClass(\""

    const-string v2, "\");"

    const-string v3, "Class<?> "

    .line 0
    invoke-static {v3, v0, v1, p0, v2}, Ll/᩶ۢۢ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ۡۧۢ;Ll/ܳۧۢ;)Ljava/lang/String;
    .locals 3

    .line 50
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "XposedHelpers.get"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 305
    iget-boolean v1, p1, Ll/ܳۧۢ;->ܽ:Z

    if-eqz v1, :cond_0

    const-string v1, "Static"

    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    :cond_0
    iget-object p1, p1, Ll/ܳۧۢ;->ܳ:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/4 v2, -0x1

    sparse-switch v1, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v1, "Z"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x7

    goto :goto_0

    :sswitch_1
    const-string v1, "S"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v2, 0x6

    goto :goto_0

    :sswitch_2
    const-string v1, "J"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    const/4 v2, 0x5

    goto :goto_0

    :sswitch_3
    const-string v1, "I"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto :goto_0

    :cond_4
    const/4 v2, 0x4

    goto :goto_0

    :sswitch_4
    const-string v1, "F"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto :goto_0

    :cond_5
    const/4 v2, 0x3

    goto :goto_0

    :sswitch_5
    const-string v1, "D"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    goto :goto_0

    :cond_6
    const/4 v2, 0x2

    goto :goto_0

    :sswitch_6
    const-string v1, "C"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    goto :goto_0

    :cond_7
    const/4 v2, 0x1

    goto :goto_0

    :sswitch_7
    const-string v1, "B"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    goto :goto_0

    :cond_8
    const/4 v2, 0x0

    :goto_0
    packed-switch v2, :pswitch_data_0

    goto :goto_1

    :pswitch_0
    const-string p1, "Boolean"

    .line 55
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :pswitch_1
    const-string p1, "Short"

    .line 57
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :pswitch_2
    const-string p1, "Long"

    .line 60
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :pswitch_3
    const-string p1, "Int"

    .line 59
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :pswitch_4
    const-string p1, "Float"

    .line 61
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :pswitch_5
    const-string p1, "Double"

    .line 62
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :pswitch_6
    const-string p1, "Char"

    .line 58
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :pswitch_7
    const-string p1, "Byte"

    .line 56
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    const-string p1, "Field(/*runtimeObject*/, \""

    .line 64
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    iget-object p0, p0, Ll/ۡۧۢ;->ۧ:Ljava/lang/String;

    const-string p1, "\");"

    .line 0
    invoke-static {v0, p0, p1}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    nop

    :sswitch_data_0
    .sparse-switch
        0x42 -> :sswitch_7
        0x43 -> :sswitch_6
        0x44 -> :sswitch_5
        0x46 -> :sswitch_4
        0x49 -> :sswitch_3
        0x4a -> :sswitch_2
        0x53 -> :sswitch_1
        0x5a -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static ֫(Ll/ۡۧۢ;Ll/᩻ۧۢ;)Ljava/lang/String;
    .locals 4

    .line 202
    iget-object v0, p1, Ll/᩻ۧۢ;->ᩳ:Ljava/lang/String;

    const-string v1, "<clinit>"

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string p0, ""

    return-object p0

    .line 14
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 15
    new-instance v2, Ll/۬ᩳۢ;

    .line 206
    iget-object p1, p1, Ll/᩻ۧۢ;->֫:Ljava/lang/String;

    .line 15
    invoke-direct {v2, p1}, Ll/۬ᩳۢ;-><init>(Ljava/lang/CharSequence;)V

    .line 17
    :goto_0
    invoke-virtual {v2}, Ll/۬ᩳۢ;->֫()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 18
    new-instance v3, Ll/ۛᩳۢ;

    invoke-direct {v3, p1}, Ll/ۛᩳۢ;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 21
    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v2, "XposedHelpers."

    invoke-direct {p1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v2, "<init>"

    .line 22
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const-string v3, "findAndHookConstructor"

    .line 23
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_2
    const-string v3, "findAndHookMethod"

    .line 25
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    const-string v3, "(\""

    .line 27
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    iget-object p0, p0, Ll/ۡۧۢ;->ᩳ:Ljava/lang/String;

    .line 27
    invoke-static {p0}, Ll/ۨᩳۢ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\", classLoader"

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    const-string p0, ", \""

    const-string v2, "\""

    .line 0
    invoke-static {p1, p0, v0, v2}, Ll/᩶۫᩷;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    :cond_3
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۛᩳۢ;

    const-string v1, ", "

    .line 33
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    iget v1, v0, Ll/ۛᩳۢ;->֫:I

    iget-object v2, v0, Ll/ۛᩳۢ;->ۧ:Ljava/lang/String;

    iget-boolean v3, v0, Ll/ۛᩳۢ;->ܽ:Z

    if-eqz v3, :cond_6

    .line 130
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "java.lang."

    .line 131
    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_4

    const/16 v3, 0xa

    .line 132
    invoke-virtual {v2, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    .line 134
    :cond_4
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_3
    const/4 v2, 0x0

    :goto_4
    if-ge v2, v1, :cond_5

    const-string v3, "[]"

    .line 137
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_5
    const-string v1, ".class"

    .line 139
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_5

    :cond_6
    if-lez v1, :cond_7

    .line 142
    iget-object v2, v0, Ll/ۛᩳۢ;->ᩳ:Ljava/lang/String;

    :cond_7
    const-string v0, "classLoader.loadClass(\""

    const-string v1, "\")"

    .line 0
    invoke-static {v0, v2, v1}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 33
    :goto_5
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_8
    const-string p0, ", new XC_MethodHook() {\n    @Override\n    protected void beforeHookedMethod(MethodHookParam param) throws Throwable {\n        super.beforeHookedMethod(param);\n    }\n    @Override\n    protected void afterHookedMethod(MethodHookParam param) throws Throwable {\n        super.afterHookedMethod(param);\n    }\n});"

    .line 35
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 87
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    const/16 v0, 0x2f

    const/16 v1, 0x2e

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
