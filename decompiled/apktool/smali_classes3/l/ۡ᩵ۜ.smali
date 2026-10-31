.class public final synthetic Ll/ۡ᩵ۜ;
.super Ljava/lang/Object;
.source "I6L2"

# interfaces
.implements Ll/᩵᩵ۜ;


# instance fields
.field public final synthetic ֫:Ljava/lang/String;

.field public final synthetic ۧ:Ljava/lang/String;

.field public final synthetic ܳ:I

.field public final synthetic ܽ:Ljava/lang/String;

.field public final synthetic ܿ:J

.field public final synthetic ᩳ:J

.field public final synthetic ᩻:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJII)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۡ᩵ۜ;->֫:Ljava/lang/String;

    iput-object p2, p0, Ll/ۡ᩵ۜ;->ۧ:Ljava/lang/String;

    iput-object p3, p0, Ll/ۡ᩵ۜ;->ܽ:Ljava/lang/String;

    iput-wide p4, p0, Ll/ۡ᩵ۜ;->ᩳ:J

    iput-wide p6, p0, Ll/ۡ᩵ۜ;->ܿ:J

    iput p8, p0, Ll/ۡ᩵ۜ;->ܳ:I

    iput p9, p0, Ll/ۡ᩵ۜ;->᩻:I

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;Ll/ᩳܰۡ;Ll/۫᩵ܿ;Ll/۟ۢۜ;)Lbin/mt/json/JSONObject;
    .locals 11

    .line 0
    iget v7, p0, Ll/ۡ᩵ۜ;->ܳ:I

    iget v8, p0, Ll/ۡ᩵ۜ;->᩻:I

    iget-object v0, p0, Ll/ۡ᩵ۜ;->֫:Ljava/lang/String;

    iget-object v1, p0, Ll/ۡ᩵ۜ;->ۧ:Ljava/lang/String;

    iget-object v2, p0, Ll/ۡ᩵ۜ;->ܽ:Ljava/lang/String;

    iget-wide v3, p0, Ll/ۡ᩵ۜ;->ᩳ:J

    iget-wide v5, p0, Ll/ۡ᩵ۜ;->ܿ:J

    move-object v9, p1

    move-object v10, p2

    invoke-static/range {v0 .. v10}, Ll/֡᩵ۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJIILjava/lang/String;Ll/ᩳܰۡ;)Lbin/mt/json/JSONObject;

    move-result-object p1

    return-object p1
.end method
