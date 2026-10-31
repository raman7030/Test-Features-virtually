.class public final Ll/ۖ᩸֫;
.super Ll/᩺ܶ֫;
.source "675F"


# static fields
.field public static final ۛ:Ljava/util/regex/Pattern;

.field public static final ۤ:Ljava/util/regex/Pattern;

.field public static final ۫:Ljava/util/regex/Pattern;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-string v0, "^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$"

    const/16 v1, 0x20

    .line 33
    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/ۖ᩸֫;->۫:Ljava/util/regex/Pattern;

    const-string v0, "^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$"

    .line 35
    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/ۖ᩸֫;->ۤ:Ljava/util/regex/Pattern;

    const-string v0, "^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$"

    .line 37
    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/ۖ᩸֫;->ۛ:Ljava/util/regex/Pattern;

    return-void
.end method

.method public static ֫(Ljava/io/File;IJJ)Ljava/io/File;
    .locals 2

    .line 50
    new-instance v0, Ljava/io/File;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ".v3.exo"

    .line 0
    invoke-static {v1, p4, p5, p1}, Ll/ܺ۫᩷;->֫(Ljava/lang/StringBuilder;JLjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 50
    invoke-direct {v0, p0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public static ֫(Ljava/io/File;JJLl/ܿ᩸֫;)Ll/ۖ᩸֫;
    .locals 16

    move-object/from16 v0, p5

    .line 108
    invoke-virtual/range {p0 .. p0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v2, ".v3.exo"

    .line 109
    invoke-virtual {v1, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-nez v2, :cond_5

    .line 154
    invoke-virtual/range {p0 .. p0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    .line 155
    sget-object v2, Ll/ۖ᩸֫;->ۤ:Ljava/util/regex/Pattern;

    invoke-virtual {v2, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v2

    .line 156
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->matches()Z

    move-result v7

    if-eqz v7, :cond_0

    .line 157
    invoke-virtual {v2, v5}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    invoke-static {v1}, Ll/ۘ֨֫;->ܳ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 159
    :cond_0
    sget-object v2, Ll/ۖ᩸֫;->۫:Ljava/util/regex/Pattern;

    invoke-virtual {v2, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v2

    .line 160
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->matches()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 161
    invoke-virtual {v2, v5}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0

    :cond_1
    move-object v1, v6

    :goto_0
    if-nez v1, :cond_2

    goto :goto_1

    .line 171
    :cond_2
    invoke-virtual/range {p0 .. p0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v7

    invoke-static {v7}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    .line 270
    invoke-virtual {v0, v1}, Ll/ܿ᩸֫;->ۧ(Ljava/lang/String;)Ll/֫᩸֫;

    move-result-object v1

    iget v8, v1, Ll/֫᩸֫;->ۧ:I

    .line 173
    invoke-virtual {v2, v4}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v9

    .line 174
    invoke-virtual {v2, v3}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v11

    .line 170
    invoke-static/range {v7 .. v12}, Ll/ۖ᩸֫;->֫(Ljava/io/File;IJJ)Ljava/io/File;

    move-result-object v1

    move-object/from16 v2, p0

    .line 175
    invoke-virtual {v2, v1}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result v2

    if-nez v2, :cond_3

    :goto_1
    move-object v1, v6

    :cond_3
    if-nez v1, :cond_4

    goto :goto_4

    .line 115
    :cond_4
    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v2

    move-object v15, v1

    move-object v1, v2

    goto :goto_2

    :cond_5
    move-object/from16 v2, p0

    move-object v15, v2

    .line 118
    :goto_2
    sget-object v2, Ll/ۖ᩸֫;->ۛ:Ljava/util/regex/Pattern;

    invoke-virtual {v2, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    .line 119
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    move-result v2

    if-nez v2, :cond_6

    goto :goto_4

    .line 123
    :cond_6
    invoke-virtual {v1, v5}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v2

    .line 155
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    .line 124
    invoke-virtual {v0, v2}, Ll/ܿ᩸֫;->֫(I)Ljava/lang/String;

    move-result-object v8

    if-nez v8, :cond_7

    goto :goto_4

    :cond_7
    const-wide/16 v9, -0x1

    cmp-long v0, p1, v9

    if-nez v0, :cond_8

    .line 130
    invoke-virtual {v15}, Ljava/io/File;->length()J

    move-result-wide v9

    move-wide v11, v9

    goto :goto_3

    :cond_8
    move-wide/from16 v11, p1

    :goto_3
    const-wide/16 v9, 0x0

    cmp-long v0, v11, v9

    if-nez v0, :cond_9

    :goto_4
    return-object v6

    .line 136
    :cond_9
    invoke-virtual {v1, v4}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v9

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, p3, v4

    if-nez v0, :cond_a

    .line 138
    invoke-virtual {v1, v3}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    move-wide v13, v0

    goto :goto_5

    :cond_a
    move-wide/from16 v13, p3

    .line 140
    :goto_5
    new-instance v0, Ll/ۖ᩸֫;

    move-object v7, v0

    .line 191
    invoke-direct/range {v7 .. v15}, Ll/᩺ܶ֫;-><init>(Ljava/lang/String;JJJLjava/io/File;)V

    return-object v0
.end method
