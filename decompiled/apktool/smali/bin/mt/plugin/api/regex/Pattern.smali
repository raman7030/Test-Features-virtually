.class public interface abstract Lbin/mt/plugin/api/regex/Pattern;
.super Ljava/lang/Object;
.source "Pattern.java"


# static fields
.field public static final CANON_EQ:I = 0x80

.field public static final CASE_INSENSITIVE:I = 0x2

.field public static final COMMENTS:I = 0x4

.field public static final DOTALL:I = 0x20

.field public static final LITERAL:I = 0x10

.field public static final MATCH_WHOLE_WORD:I = 0x200

.field public static final MULTILINE:I = 0x8

.field public static final UNICODE_CASE:I = 0x40

.field public static final UNICODE_CHARACTER_CLASS:I = 0x100

.field public static final UNIX_LINES:I = 0x1


# virtual methods
.method public abstract flags()I
.end method

.method public abstract matcher(Ljava/lang/CharSequence;)Lbin/mt/plugin/api/regex/Matcher;
.end method

.method public abstract pattern()Ljava/lang/String;
.end method
