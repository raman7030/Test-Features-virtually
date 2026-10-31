.class public final Ll/ۢ֡ۚ;
.super Ljava/lang/Object;
.source "G67D"

# interfaces
.implements Ljava/util/Map$Entry;
.implements Ljava/lang/Cloneable;


# static fields
.field public static final ۗ:Ljava/util/regex/Pattern;

.field public static final ۙ:[Ljava/lang/String;

.field public static final ۤ:Ljava/util/regex/Pattern;

.field public static final ۫:Ljava/util/regex/Pattern;

.field public static final ۬:Ljava/util/regex/Pattern;


# instance fields
.field public ᩶:Ljava/lang/String;

.field public ᩸:Ljava/lang/String;

.field public ᩹:Ll/ܺ֡ۚ;


# direct methods
.method public static constructor <clinit>()V
    .locals 30

    const-string v28, "truespeed"

    const-string v29, "typemustmatch"

    const-string v0, "allowfullscreen"

    const-string v1, "async"

    const-string v2, "autofocus"

    const-string v3, "checked"

    const-string v4, "compact"

    const-string v5, "declare"

    const-string v6, "default"

    const-string v7, "defer"

    const-string v8, "disabled"

    const-string v9, "formnovalidate"

    const-string v10, "hidden"

    const-string v11, "inert"

    const-string v12, "ismap"

    const-string v13, "itemscope"

    const-string v14, "multiple"

    const-string v15, "muted"

    const-string v16, "nohref"

    const-string v17, "noresize"

    const-string v18, "noshade"

    const-string v19, "novalidate"

    const-string v20, "nowrap"

    const-string v21, "open"

    const-string v22, "readonly"

    const-string v23, "required"

    const-string v24, "reversed"

    const-string v25, "seamless"

    const-string v26, "selected"

    const-string v27, "sortable"

    .line 19
    filled-new-array/range {v0 .. v29}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ll/ۢ֡ۚ;->ۙ:[Ljava/lang/String;

    const-string v0, "[a-zA-Z_:][-a-zA-Z0-9_:.]*"

    .line 150
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/ۢ֡ۚ;->ۤ:Ljava/util/regex/Pattern;

    const-string v0, "[^-a-zA-Z0-9_:.]"

    .line 151
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/ۢ֡ۚ;->۫:Ljava/util/regex/Pattern;

    const-string v0, "[^\\x00-\\x1f\\x7f-\\x9f \"\'/=]+"

    .line 152
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/ۢ֡ۚ;->۬:Ljava/util/regex/Pattern;

    const-string v0, "[\\x00-\\x1f\\x7f-\\x9f \"\'/=]"

    .line 153
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/ۢ֡ۚ;->ۗ:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ll/ܺ֡ۚ;)V
    .locals 0

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    invoke-static {p1}, Ll/ܿ֡ۚ;->֫(Ljava/lang/Object;)V

    .line 48
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    .line 49
    invoke-static {p1}, Ll/ܿ֡ۚ;->֫(Ljava/lang/String;)V

    .line 50
    iput-object p1, p0, Ll/ۢ֡ۚ;->᩸:Ljava/lang/String;

    .line 51
    iput-object p2, p0, Ll/ۢ֡ۚ;->᩶:Ljava/lang/String;

    .line 52
    iput-object p3, p0, Ll/ۢ֡ۚ;->᩹:Ll/ܺ֡ۚ;

    return-void
.end method

.method public static ֫(Ljava/lang/String;Ll/᩵֡ۚ;)Ljava/lang/String;
    .locals 4

    .line 157
    sget-object v0, Ll/᩵֡ۚ;->᩶:Ll/᩵֡ۚ;

    const/4 v1, 0x0

    const-string v2, ""

    if-ne p1, v0, :cond_1

    sget-object v0, Ll/ۢ֡ۚ;->ۤ:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/regex/Matcher;->matches()Z

    move-result v3

    if-nez v3, :cond_1

    .line 158
    sget-object p1, Ll/ۢ֡ۚ;->۫:Ljava/util/regex/Pattern;

    invoke-virtual {p1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    invoke-virtual {p0, v2}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 159
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/regex/Matcher;->matches()Z

    move-result p1

    if-eqz p1, :cond_0

    return-object p0

    :cond_0
    return-object v1

    .line 161
    :cond_1
    sget-object v0, Ll/᩵֡ۚ;->᩹:Ll/᩵֡ۚ;

    if-ne p1, v0, :cond_3

    sget-object p1, Ll/ۢ֡ۚ;->۬:Ljava/util/regex/Pattern;

    invoke-virtual {p1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-nez v0, :cond_3

    .line 162
    sget-object v0, Ll/ۢ֡ۚ;->ۗ:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    invoke-virtual {p0, v2}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 163
    invoke-virtual {p1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/regex/Matcher;->matches()Z

    move-result p1

    if-eqz p1, :cond_2

    return-object p0

    :cond_2
    return-object v1

    :cond_3
    return-object p0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Appendable;Ll/֡֡ۚ;)V
    .locals 7

    .line 142
    invoke-interface {p2, p0}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 209
    invoke-virtual {p3}, Ll/֡֡ۚ;->᩷()Ll/᩵֡ۚ;

    move-result-object v0

    sget-object v1, Ll/᩵֡ۚ;->᩹:Ll/᩵֡ۚ;

    if-ne v0, v1, :cond_2

    if-eqz p1, :cond_1

    .line 210
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 217
    :cond_0
    sget-object v0, Ll/ۢ֡ۚ;->ۙ:[Ljava/lang/String;

    invoke-static {p0}, Ll/᩻֡ۚ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Ljava/util/Arrays;->binarySearch([Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p0

    if-ltz p0, :cond_2

    :cond_1
    return-void

    :cond_2
    const-string p0, "=\""

    .line 144
    invoke-interface {p2, p0}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    if-nez p1, :cond_3

    const-string p1, ""

    :cond_3
    move-object v1, p1

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    move-object v0, p2

    move-object v2, p3

    .line 145
    invoke-static/range {v0 .. v6}, Ll/۬֡ۚ;->֫(Ljava/lang/Appendable;Ljava/lang/String;Ll/֡֡ۚ;ZZZZ)V

    const/16 p0, 0x22

    .line 146
    invoke-interface {p2, p0}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    return-void
.end method


# virtual methods
.method public final clone()Ljava/lang/Object;
    .locals 2

    .line 239
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۢ֡ۚ;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 241
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_5

    .line 223
    const-class v2, Ll/ۢ֡ۚ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_1

    .line 224
    :cond_1
    check-cast p1, Ll/ۢ֡ۚ;

    iget-object v2, p1, Ll/ۢ֡ۚ;->᩸:Ljava/lang/String;

    .line 225
    iget-object v3, p0, Ll/ۢ֡ۚ;->᩸:Ljava/lang/String;

    if-eqz v3, :cond_2

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_0

    :cond_2
    if-eqz v2, :cond_3

    :goto_0
    return v1

    .line 226
    :cond_3
    iget-object v2, p0, Ll/ۢ֡ۚ;->᩶:Ljava/lang/String;

    iget-object p1, p1, Ll/ۢ֡ۚ;->᩶:Ljava/lang/String;

    if-eqz v2, :cond_4

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_4
    if-nez p1, :cond_5

    return v0

    :cond_5
    :goto_1
    return v1
.end method

.method public final getKey()Ljava/lang/Object;
    .locals 1

    .line 61
    iget-object v0, p0, Ll/ۢ֡ۚ;->᩸:Ljava/lang/String;

    return-object v0
.end method

.method public final getKey()Ljava/lang/String;
    .locals 1

    .line 61
    iget-object v0, p0, Ll/ۢ֡ۚ;->᩸:Ljava/lang/String;

    return-object v0
.end method

.method public final bridge synthetic getValue()Ljava/lang/Object;
    .locals 1

    .line 18
    invoke-virtual {p0}, Ll/ۢ֡ۚ;->getValue()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getValue()Ljava/lang/String;
    .locals 1

    .line 86
    iget-object v0, p0, Ll/ۢ֡ۚ;->᩶:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, ""

    :cond_0
    return-object v0
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x0

    .line 231
    iget-object v1, p0, Ll/ۢ֡ۚ;->᩸:Ljava/lang/String;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    mul-int/lit8 v1, v1, 0x1f

    .line 232
    iget-object v2, p0, Ll/ۢ֡ۚ;->᩶:Ljava/lang/String;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v0

    :cond_1
    add-int/2addr v1, v0

    return v1
.end method

.method public final bridge synthetic setValue(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 18
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Ll/ۢ֡ۚ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 120
    invoke-static {}, Ll/᩷֡ۚ;->֫()Ljava/lang/StringBuilder;

    move-result-object v0

    .line 123
    :try_start_0
    new-instance v1, Ll/֨֡ۚ;

    const-string v2, ""

    invoke-direct {v1, v2}, Ll/֨֡ۚ;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ll/֨֡ۚ;->֡֫()Ll/֡֡ۚ;

    move-result-object v1

    .line 131
    iget-object v2, p0, Ll/ۢ֡ۚ;->᩸:Ljava/lang/String;

    iget-object v3, p0, Ll/ۢ֡ۚ;->᩶:Ljava/lang/String;

    .line 135
    invoke-virtual {v1}, Ll/֡֡ۚ;->᩷()Ll/᩵֡ۚ;

    move-result-object v4

    invoke-static {v2, v4}, Ll/ۢ֡ۚ;->֫(Ljava/lang/String;Ll/᩵֡ۚ;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_0

    goto :goto_0

    .line 137
    :cond_0
    invoke-static {v2, v3, v0, v1}, Ll/ۢ֡ۚ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Appendable;Ll/֡֡ۚ;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 127
    :goto_0
    invoke-static {v0}, Ll/᩷֡ۚ;->֫(Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v0

    .line 125
    new-instance v1, Ll/֫֡ۚ;

    .line 34
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 125
    throw v1
.end method

.method public final ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 103
    iget-object v0, p0, Ll/ۢ֡ۚ;->᩶:Ljava/lang/String;

    .line 104
    iget-object v1, p0, Ll/ۢ֡ۚ;->᩹:Ll/ܺ֡ۚ;

    if-eqz v1, :cond_0

    .line 105
    iget-object v2, p0, Ll/ۢ֡ۚ;->᩸:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ll/ܺ֡ۚ;->ܿ(Ljava/lang/String;)I

    move-result v1

    const/4 v3, -0x1

    if-eq v1, v3, :cond_0

    .line 107
    iget-object v0, p0, Ll/ۢ֡ۚ;->᩹:Ll/ܺ֡ۚ;

    invoke-virtual {v0, v2}, Ll/ܺ֡ۚ;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 108
    iget-object v2, p0, Ll/ۢ֡ۚ;->᩹:Ll/ܺ֡ۚ;

    iget-object v2, v2, Ll/ܺ֡ۚ;->᩶:[Ljava/lang/Object;

    aput-object p1, v2, v1

    .line 111
    :cond_0
    iput-object p1, p0, Ll/ۢ֡ۚ;->᩶:Ljava/lang/String;

    if-nez v0, :cond_1

    const-string p1, ""

    return-object p1

    :cond_1
    return-object v0
.end method
