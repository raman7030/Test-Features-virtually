.class public final Ll/ܳܶ۠;
.super Ljava/lang/Object;
.source "O433"

# interfaces
.implements Ll/ۨۖ֨;


# static fields
.field public static ۜ:Ljava/util/ResourceBundle;

.field public static final ᩷:Ll/ۙ֨۠;


# instance fields
.field public ֫:Ljava/util/HashMap;

.field public ۧ:Ll/ۖܶ۠;

.field public ܳ:Ll/ۛ۠۠;

.field public ܽ:Ll/ۗ֨۠;

.field public ܿ:Ljava/util/Locale;

.field public ᩳ:Ll/ۖܶ۠;

.field public ᩻:Ll/ܺ֨۠;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 52
    new-instance v0, Ll/ۙ֨۠;

    invoke-direct {v0}, Ll/ۙ֨۠;-><init>()V

    sput-object v0, Ll/ܳܶ۠;->᩷:Ll/ۙ֨۠;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 102
    invoke-direct {p0, v0}, Ll/ܳܶ۠;-><init>(Ljava/util/Locale;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/Locale;)V
    .locals 1

    .line 108
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 109
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object v0

    iput-object v0, p0, Ll/ܳܶ۠;->ۧ:Ll/ۖܶ۠;

    .line 110
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ܳܶ۠;->֫:Ljava/util/HashMap;

    const-string v0, "com.sun.tools.javac.resources.compiler"

    .line 111
    invoke-virtual {p0, v0}, Ll/ܳܶ۠;->֫(Ljava/lang/String;)V

    if-nez p1, :cond_0

    .line 78
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object p1

    .line 80
    :cond_0
    invoke-virtual {p0, p1}, Ll/ܳܶ۠;->֫(Ljava/util/Locale;)Ll/ۖܶ۠;

    move-result-object v0

    iput-object v0, p0, Ll/ܳܶ۠;->ᩳ:Ll/ۖܶ۠;

    .line 81
    iput-object p1, p0, Ll/ܳܶ۠;->ܿ:Ljava/util/Locale;

    return-void
.end method

.method public static varargs ֫(Ll/ۖܶ۠;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    const/4 v0, 0x0

    .line 217
    :goto_0
    invoke-virtual {p0}, Ll/ۖܶ۠;->ܽ()Z

    move-result v1

    if-eqz v1, :cond_0

    if-nez v0, :cond_0

    .line 218
    iget-object v1, p0, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v1, Ljava/util/ResourceBundle;

    .line 220
    :try_start_0
    invoke-virtual {v1, p1}, Ljava/util/ResourceBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/util/MissingResourceException; {:try_start_0 .. :try_end_0} :catch_0

    .line 217
    :catch_0
    iget-object p0, p0, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    goto :goto_0

    :cond_0
    if-nez v0, :cond_1

    const-string p0, "compiler message file broken: key="

    const-string v0, " arguments={0}, {1}, {2}, {3}, {4}, {5}, {6}, {7}"

    .line 0
    invoke-static {p0, p1, v0}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 230
    :cond_1
    invoke-static {v0, p2}, Ljava/text/MessageFormat;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ۗ֨۠;)Ll/ܳܶ۠;
    .locals 3

    .line 56
    sget-object v0, Ll/ܳܶ۠;->᩷:Ll/ۙ֨۠;

    invoke-virtual {p0, v0}, Ll/ۗ֨۠;->֫(Ll/ۙ֨۠;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܳܶ۠;

    if-nez v1, :cond_1

    .line 58
    new-instance v1, Ll/ܳܶ۠;

    .line 89
    const-class v2, Ljava/util/Locale;

    invoke-virtual {p0, v2}, Ll/ۗ֨۠;->֫(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Locale;

    invoke-direct {v1, v2}, Ll/ܳܶ۠;-><init>(Ljava/util/Locale;)V

    .line 90
    iput-object p0, v1, Ll/ܳܶ۠;->ܽ:Ll/ۗ֨۠;

    .line 91
    invoke-virtual {p0, v0, v1}, Ll/ۗ֨۠;->֫(Ll/ۙ֨۠;Ljava/lang/Object;)V

    .line 92
    invoke-static {p0}, Ll/ۨܶ۠;->֫(Ll/ۗ֨۠;)Ll/ۨܶ۠;

    move-result-object p0

    const-string v0, "rawDiagnostics"

    .line 93
    invoke-virtual {p0, v0}, Ll/ۨܶ۠;->ۧ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 94
    new-instance v0, Ll/ܿ᩸۠;

    invoke-direct {v0, p0}, Ll/ܿ᩸۠;-><init>(Ll/ۨܶ۠;)V

    goto :goto_0

    .line 95
    :cond_0
    new-instance v0, Ll/ۚ֨۠;

    invoke-direct {v0, p0, v1}, Ll/ۚ֨۠;-><init>(Ll/ۨܶ۠;Ll/ܳܶ۠;)V

    :goto_0
    iput-object v0, v1, Ll/ܳܶ۠;->᩻:Ll/ܺ֨۠;

    :cond_1
    return-object v1
.end method

.method public static varargs ۧ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 204
    :try_start_0
    sget-object v0, Ll/ܳܶ۠;->ۜ:Ljava/util/ResourceBundle;

    if-nez v0, :cond_0

    const-string v0, "com.sun.tools.javac.resources.compiler"

    .line 205
    invoke-static {v0}, Ljava/util/ResourceBundle;->getBundle(Ljava/lang/String;)Ljava/util/ResourceBundle;

    move-result-object v0

    sput-object v0, Ll/ܳܶ۠;->ۜ:Ljava/util/ResourceBundle;

    .line 206
    :cond_0
    sget-object v0, Ll/ܳܶ۠;->ۜ:Ljava/util/ResourceBundle;
    :try_end_0
    .catch Ljava/util/MissingResourceException; {:try_start_0 .. :try_end_0} :catch_0

    .line 191
    invoke-static {v0}, Ll/ۖܶ۠;->of(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object v0

    invoke-static {v0, p0, p1}, Ll/ܳܶ۠;->֫(Ll/ۖܶ۠;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :catch_0
    move-exception p0

    .line 209
    new-instance p1, Ljava/lang/Error;

    const-string v0, "Fatal: Resource for compiler is missing"

    invoke-direct {p1, v0, p0}, Ljava/lang/Error;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1
.end method


# virtual methods
.method public final varargs ֫(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 155
    iget-object v0, p0, Ll/ܳܶ۠;->ܿ:Ljava/util/Locale;

    invoke-virtual {p0, v0, p1, p2}, Ll/ܳܶ۠;->֫(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final varargs ֫(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    if-nez p1, :cond_0

    .line 165
    iget-object p1, p0, Ll/ܳܶ۠;->ܿ:Ljava/util/Locale;

    .line 166
    :cond_0
    invoke-virtual {p0, p1}, Ll/ܳܶ۠;->֫(Ljava/util/Locale;)Ll/ۖܶ۠;

    move-result-object p1

    invoke-static {p1, p2, p3}, Ll/ܳܶ۠;->֫(Ll/ۖܶ۠;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ۙ۠۠;)Ljava/lang/String;
    .locals 7

    .line 159
    iget-object v0, p0, Ll/ܳܶ۠;->ܿ:Ljava/util/Locale;

    .line 172
    invoke-virtual {p0, v0}, Ll/ܳܶ۠;->֫(Ljava/util/Locale;)Ll/ۖܶ۠;

    move-result-object v0

    const/4 v5, 0x0

    move-object v1, v5

    .line 235
    :goto_0
    invoke-virtual {v0}, Ll/ۖܶ۠;->ܽ()Z

    move-result v2

    if-eqz v2, :cond_0

    if-nez v1, :cond_0

    .line 236
    iget-object v2, v0, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v2, Ljava/util/ResourceBundle;

    .line 238
    :try_start_0
    invoke-virtual {p1}, Ll/ۙ۠۠;->֫()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ResourceBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catch Ljava/util/MissingResourceException; {:try_start_0 .. :try_end_0} :catch_0

    .line 235
    :catch_0
    iget-object v0, v0, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    goto :goto_0

    :cond_0
    if-nez v1, :cond_1

    .line 245
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "compiler message file broken: key="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ll/ۙ۠۠;->֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " arguments={0}, {1}, {2}, {3}, {4}, {5}, {6}, {7}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 248
    :cond_1
    sget-object v0, Ll/ۛᩴ۠;->ۖ֫:Ll/۫۠۠;

    if-ne p1, v0, :cond_2

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    .line 249
    invoke-static {v1, p1}, Ljava/text/MessageFormat;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    .line 251
    :cond_2
    iget-object v0, p0, Ll/ܳܶ۠;->᩻:Ll/ܺ֨۠;

    .line 257
    iget-object v1, p0, Ll/ܳܶ۠;->ܳ:Ll/ۛ۠۠;

    if-nez v1, :cond_3

    .line 258
    iget-object v1, p0, Ll/ܳܶ۠;->ܽ:Ll/ۗ֨۠;

    invoke-static {v1}, Ll/ۛ۠۠;->֫(Ll/ۗ֨۠;)Ll/ۛ۠۠;

    move-result-object v1

    iput-object v1, p0, Ll/ܳܶ۠;->ܳ:Ll/ۛ۠۠;

    .line 260
    :cond_3
    iget-object v1, p0, Ll/ܳܶ۠;->ܳ:Ll/ۛ۠۠;

    .line 251
    sget-object v4, Ll/ܳ۠۠;->᩷:Ll/ܳ۠۠;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 255
    const-class v2, Ll/᩶۠۠;

    invoke-static {v2}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object v3

    const/4 v2, 0x0

    move-object v6, p1

    invoke-virtual/range {v1 .. v6}, Ll/ۛ۠۠;->֫(Ll/᩶ᩴ֨;Ljava/util/Set;Ll/ܳ۠۠;Ll/ۗ۠۠;Ll/ۙ۠۠;)Ll/ܽܶ۠;

    move-result-object p1

    .line 251
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    iget-object v1, p0, Ll/ܳܶ۠;->ܿ:Ljava/util/Locale;

    invoke-virtual {v0, p1, v1}, Ll/ܺ֨۠;->ܽ(Ll/ܽܶ۠;Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    :goto_1
    return-object p1
.end method

.method public final ֫()Ljava/util/Locale;
    .locals 1

    .line 73
    iget-object v0, p0, Ll/ܳܶ۠;->ܿ:Ljava/util/Locale;

    return-object v0
.end method

.method public final ֫(Ljava/util/Locale;)Ll/ۖܶ۠;
    .locals 5

    .line 132
    iget-object v0, p0, Ll/ܳܶ۠;->ܿ:Ljava/util/Locale;

    if-ne p1, v0, :cond_0

    iget-object v0, p0, Ll/ܳܶ۠;->ᩳ:Ll/ۖܶ۠;

    if-eqz v0, :cond_0

    return-object v0

    .line 134
    :cond_0
    iget-object v0, p0, Ll/ܳܶ۠;->֫:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/ref/SoftReference;

    if-nez v1, :cond_1

    const/4 v1, 0x0

    goto :goto_0

    .line 135
    :cond_1
    invoke-virtual {v1}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۖܶ۠;

    :goto_0
    if-nez v1, :cond_3

    .line 137
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object v1

    .line 138
    iget-object v2, p0, Ll/ܳܶ۠;->ۧ:Ll/ۖܶ۠;

    invoke-virtual {v2}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܿܶ۠;

    .line 140
    :try_start_0
    invoke-interface {v3, p1}, Ll/ܿܶ۠;->֫(Ljava/util/Locale;)Ljava/util/ResourceBundle;

    move-result-object v3

    .line 141
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    new-instance v4, Ll/ۖܶ۠;

    invoke-direct {v4, v3, v1}, Ll/ۖܶ۠;-><init>(Ljava/lang/Object;Ll/ۖܶ۠;)V
    :try_end_0
    .catch Ljava/util/MissingResourceException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v1, v4

    goto :goto_1

    :catch_0
    move-exception v0

    .line 143
    new-instance v1, Ll/۠ۖ֨;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Cannot find requested resource bundle for locale "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 70
    invoke-direct {v1, p1, v0}, Ljava/lang/Error;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 143
    throw v1

    .line 147
    :cond_2
    new-instance v2, Ljava/lang/ref/SoftReference;

    invoke-direct {v2, v1}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, p1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    return-object v1
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 2

    .line 121
    new-instance v0, Ll/ᩳܶ۠;

    invoke-direct {v0, p1}, Ll/ᩳܶ۠;-><init>(Ljava/lang/String;)V

    .line 125
    iget-object p1, p0, Ll/ܳܶ۠;->ۧ:Ll/ۖܶ۠;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    new-instance v1, Ll/ۖܶ۠;

    invoke-direct {v1, v0, p1}, Ll/ۖܶ۠;-><init>(Ljava/lang/Object;Ll/ۖܶ۠;)V

    .line 125
    iput-object v1, p0, Ll/ܳܶ۠;->ۧ:Ll/ۖܶ۠;

    .line 126
    iget-object p1, p0, Ll/ܳܶ۠;->֫:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/HashMap;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 127
    invoke-virtual {p1}, Ljava/util/HashMap;->clear()V

    :cond_0
    const/4 p1, 0x0

    .line 128
    iput-object p1, p0, Ll/ܳܶ۠;->ᩳ:Ll/ۖܶ۠;

    return-void
.end method
