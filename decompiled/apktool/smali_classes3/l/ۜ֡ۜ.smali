.class public final Ll/ۜ֡ۜ;
.super Ll/ۙۛ᩻;
.source "G6KW"


# instance fields
.field public final ֫:Ll/ܰ᩵ۜ;


# direct methods
.method public constructor <init>(Ll/ܰ᩵ۜ;)V
    .locals 0

    .line 18
    invoke-direct {p0}, Ll/ۙۛ᩻;-><init>()V

    .line 19
    iput-object p1, p0, Ll/ۜ֡ۜ;->֫:Ll/ܰ᩵ۜ;

    return-void
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;
    .locals 2

    .line 68
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "type"

    invoke-static {p0, p1}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    invoke-virtual {v0, v1, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final ֫()Lbin/mt/json/JSONObject;
    .locals 3

    .line 39
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "readOnlyHint"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "destructiveHint"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ۗۛ᩻;)Lbin/mt/json/JSONObject;
    .locals 1

    const/4 v0, 0x0

    .line 87
    invoke-static {p1, v0}, Ll/᩷֡ۜ;->֫(Ll/ۗۛ᩻;Z)Lbin/mt/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Lbin/mt/json/JSONObject;)Ll/۬ۛ᩻;
    .locals 2

    .line 92
    new-instance v0, Ll/۬ۛ᩻;

    iget-object v1, p0, Ll/ۜ֡ۜ;->֫:Ll/ܰ᩵ۜ;

    invoke-virtual {v1, p1}, Ll/ܰ᩵ۜ;->ۧ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object p1

    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v1

    invoke-static {p1, v1}, Ll/᩶ۛ᩻;->֫(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object p1

    invoke-direct {v0, p1}, Ll/۬ۛ᩻;-><init>(Lbin/mt/json/JSONObject;)V

    return-object v0
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    const-string v0, "Add, delete, or rename entries in an existing ZIP archive. Operations are unordered and refer to the original ZIP; chains, swaps, repeated changes, competing targets, and overlapping rename/delete directory ranges are rejected before writing. ZIP names are case-sensitive; abc and abc/ are distinct, and leading /, . and .. are preserved literally. New files use deflate; replacements preserve the original compression method. Unchanged and renamed entries retain their original encryption and passwords. Updating a damaged archive may discard unreadable entries, even outside the requested changes; use mt_zip_test first if integrity needs checking. No APK signing is performed. If saving fails, check the reported destination state before retrying."

    return-object v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    const-string v0, "Update ZIP"

    return-object v0
.end method

.method public final ܽ()Lbin/mt/json/JSONObject;
    .locals 11

    const-string v0, "add"

    const-string v1, "Add a local file or directory."

    .line 44
    invoke-static {v0, v1}, Ll/ۜ֡ۜ;->֫(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "string"

    const-string v2, "Absolute or Home-relative source file or directory; directories must end in /. Includes hidden files and empty directories."

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "sourcePath"

    .line 45
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Complete destination ZIP entry path, not a basename. Files have no trailing /; directory sources require / or an empty string for the root. Maps contents without the source folder name: images/ to assets/ puts images/a.png at assets/a.png."

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "entryPath"

    .line 46
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "boolean"

    const-string v4, "True permits replacing original files at mapped names; recommended false. Never resolves conflicts between operations."

    .line 124
    invoke-static {v2, v4}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "overwrite"

    .line 47
    invoke-virtual {v0, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v4, "Delete one original file."

    const-string v5, "delete"

    .line 48
    invoke-static {v5, v4}, Ll/ۜ֡ۜ;->֫(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v6, "Non-empty exact ZIP file path without a trailing /."

    .line 96
    invoke-static {v1, v6}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    .line 48
    invoke-virtual {v4, v3, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v7, "Delete an original directory."

    .line 49
    invoke-static {v5, v7}, Ll/ۜ֡ۜ;->֫(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v7, "Non-empty exact ZIP directory path ending in /; / is a literal directory name, distinct from the empty ZIP root."

    .line 96
    invoke-static {v1, v7}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v8

    .line 49
    invoke-virtual {v5, v3, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v8, "True is required when the directory contains entries."

    .line 124
    invoke-static {v2, v8}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v9, "recursive"

    .line 50
    invoke-virtual {v5, v9, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v8, "Rename one original file."

    const-string v9, "rename"

    .line 51
    invoke-static {v9, v8}, Ll/ۜ֡ۜ;->֫(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v8

    .line 96
    invoke-static {v1, v6}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    .line 51
    invoke-virtual {v8, v3, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v8, "Complete destination ZIP file path, not a basename, without a trailing /. To rename in place, retain the parent: docs/a.txt to docs/b.txt. A different target file must not already exist."

    .line 96
    invoke-static {v1, v8}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v10, "newEntryPath"

    .line 52
    invoke-virtual {v6, v10, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v8, "Rename an original directory, including its descendants."

    .line 53
    invoke-static {v9, v8}, Ll/ۜ֡ۜ;->֫(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v8

    .line 96
    invoke-static {v1, v7}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    .line 53
    invoke-virtual {v8, v3, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v7, "Complete destination ZIP directory path, not a basename, ending in /. Retain the parent to rename in place: docs/old/ to docs/new/. Cannot be empty or a descendant of the source directory; / is a literal directory name."

    .line 96
    invoke-static {v1, v7}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    .line 54
    invoke-virtual {v3, v10, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v7, "True permits recursively merging an existing destination directory; recommended false. Same-name files still reject the whole request."

    .line 124
    invoke-static {v2, v7}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v7, "mergeDirectories"

    .line 55
    invoke-virtual {v3, v7, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 56
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v7, "Absolute or Home-relative existing ZIP file; split archives are not supported."

    .line 96
    invoke-static {v1, v7}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v8, "path"

    .line 57
    invoke-virtual {v3, v8, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v7, "description"

    const-string v8, "Non-empty unordered modifications. File operations must omit directory-only fields."

    const-string v9, "type"

    const-string v10, "array"

    .line 0
    invoke-static {v9, v10, v7, v8}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    .line 59
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v8

    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v9

    const-string v10, "Add."

    .line 60
    invoke-static {v0, v10}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    invoke-virtual {v9, v0}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-result-object v0

    const-string v9, "Delete file."

    .line 61
    invoke-static {v4, v9}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    invoke-virtual {v0, v4}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-result-object v0

    const-string v4, "Delete directory."

    .line 62
    invoke-static {v5, v4}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    invoke-virtual {v0, v4}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-result-object v0

    const-string v4, "Rename file."

    .line 63
    invoke-static {v6, v4}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    invoke-virtual {v0, v4}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-result-object v0

    const-string v4, "Rename directory."

    .line 64
    invoke-static {v2, v4}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    invoke-virtual {v0, v2}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-result-object v0

    const-string v2, "anyOf"

    .line 59
    invoke-virtual {v8, v2, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "items"

    invoke-virtual {v7, v2, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "operations"

    .line 58
    invoke-virtual {v3, v2, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "password"

    const-string v3, "Output password for all files added or replaced in this call: empty string writes them unencrypted; otherwise encrypts them with AES-256. The old password is not required or verified. Pass an empty string for delete/rename-only requests."

    const-string v4, "Arguments for mt_zip_update."

    .line 0
    invoke-static {v0, v1, v3, v2, v4}, Ll/ᩴۨۡ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public final ܿ()Lbin/mt/json/JSONObject;
    .locals 2

    const-string v0, "mt_zip_update"

    const/4 v1, 0x0

    .line 82
    invoke-static {v0, v1}, Ll/᩷֡ۜ;->֫(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    const-string v0, "mt_zip_update"

    return-object v0
.end method
